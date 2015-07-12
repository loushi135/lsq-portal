package com.portal.cms.dao.main;

import com.portal.cms.entity.main.ContentTxt;
import com.portal.common.hibernate3.Updater;

public interface ContentTxtDao {
	public ContentTxt findById(Integer id);

	public ContentTxt save(ContentTxt bean);

	public ContentTxt updateByUpdater(Updater<ContentTxt> updater);
}