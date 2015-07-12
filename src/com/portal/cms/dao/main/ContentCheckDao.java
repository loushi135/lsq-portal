package com.portal.cms.dao.main;

import com.portal.cms.entity.main.ContentCheck;
import com.portal.common.hibernate3.Updater;

public interface ContentCheckDao {
	public ContentCheck findById(Long id);

	public ContentCheck save(ContentCheck bean);

	public ContentCheck updateByUpdater(Updater<ContentCheck> updater);
}