package com.portal.cms.dao.main;

import com.portal.cms.entity.main.ContentExt;
import com.portal.common.hibernate3.Updater;

public interface ContentExtDao {
	public ContentExt findById(Integer id);

	public ContentExt save(ContentExt bean);

	public ContentExt updateByUpdater(Updater<ContentExt> updater);
}