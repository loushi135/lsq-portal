package com.portal.cms.action.directive;

import static com.portal.common.web.freemarker.DirectiveUtils.OUT_BEAN;
import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.portal.cms.entity.main.CmsModel;
import com.portal.cms.manager.main.CmsModelMng;
import com.portal.common.web.freemarker.DirectiveUtils;
import com.portal.common.web.freemarker.ParamsRequiredException;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 模型对象标签
 * 
 */
public class CmsModelDirective implements TemplateDirectiveModel {
	/**
	 * 输入参数，栏目ID。
	 */
	public static final String PARAM_ID = "id";
	/**
	 * 输入参数，栏目路径。
	 */
	public static final String PARAM_PATH = "path";

	@SuppressWarnings("unchecked")
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		Integer id = DirectiveUtils.getInt(PARAM_ID, params);
		CmsModel model;
		if (id != null) {
			model = modelMng.findById(id);
		} else {
			String path = DirectiveUtils.getString(PARAM_PATH, params);
			if (StringUtils.isBlank(path)) {
				// 如果path不存在，那么id必须存在。
				throw new ParamsRequiredException(PARAM_ID);
			}
			model = modelMng.findByPath(path);
		}

		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(
				params);
		paramWrap.put(OUT_BEAN, DEFAULT_WRAPPER.wrap(model));
		Map<String, TemplateModel> origMap = DirectiveUtils
				.addParamsToVariable(env, paramWrap);
		body.render(env.getOut());
		DirectiveUtils.removeParamsFromVariable(env, paramWrap, origMap);
	}

	@Autowired
	private CmsModelMng modelMng;
}
