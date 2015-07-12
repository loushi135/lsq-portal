package com.portal.cms.manager.main;

import com.portal.cms.entity.main.Content;
import com.portal.cms.entity.main.ContentTxt;

public interface ContentTxtMng {
	public ContentTxt save(ContentTxt txt, Content content);

	public ContentTxt update(ContentTxt txt, Content content);
}