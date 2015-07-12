package com.portal.cms.manager.main;

import com.portal.cms.entity.main.Content;
import com.portal.cms.entity.main.ContentExt;

public interface ContentExtMng {
	public ContentExt save(ContentExt ext, Content content);

	public ContentExt update(ContentExt ext);
}