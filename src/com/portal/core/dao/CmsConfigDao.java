package com.portal.core.dao;

import com.portal.common.hibernate3.Updater;
import com.portal.core.entity.CmsConfig;

public interface CmsConfigDao {
	public CmsConfig findById(Integer id);

	public CmsConfig updateByUpdater(Updater<CmsConfig> updater);
}