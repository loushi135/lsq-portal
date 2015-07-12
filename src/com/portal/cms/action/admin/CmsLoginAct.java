package com.portal.cms.action.admin;

import static org.apache.shiro.web.filter.authc.FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.cms.entity.main.Channel;
import com.portal.cms.manager.main.ChannelMng;
import com.portal.core.entity.CmsSite;
import com.portal.core.manager.CmsSiteMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CmsLoginAct {
    @Autowired
    private ChannelMng channelMng;
    @Autowired
    private CmsSiteMng cmsSiteMng;

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String input(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
        CmsSite cmsSite = cmsSiteMng.findById(1);
	    List<Channel> channelList = channelMng.getBottomList(cmsSite.getId(),false);
        model.put("channelList",channelList);
        model.put("site",cmsSite);
        return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String submit(String username, String password, String captcha,
			String message, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Object error = request.getAttribute(DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (error != null) {
			model.addAttribute("error", error);
		}
        CmsSite cmsSite = cmsSiteMng.findById(1);
        List<Channel> channelList = channelMng.getBottomList(cmsSite.getId(),false);
        model.put("channelList",channelList);
        model.put("site",cmsSite);
		return "login";
	}
}
