package com.portal.cms.manager.main;

import java.util.List;

import com.portal.cms.entity.main.ContentType;

public interface ContentTypeMng {
	public List<ContentType> getList(boolean containDisabled);

	public ContentType getDef();

	public ContentType findById(Integer id);

	public ContentType save(ContentType bean);

	public ContentType update(ContentType bean);

	public ContentType deleteById(Integer id);

	public ContentType[] deleteByIds(Integer[] ids);
}