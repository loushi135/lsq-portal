package com.portal.cms.dao.assist;

import java.util.List;

import com.portal.cms.entity.assist.CmsFriendlink;
import com.portal.common.hibernate3.Updater;

public interface CmsFriendlinkDao {
	public List<CmsFriendlink> getList(Integer siteId, Integer ctgId,
			Boolean enabled);

	public int countByCtgId(Integer ctgId);

	public CmsFriendlink findById(Integer id);

	public CmsFriendlink save(CmsFriendlink bean);

	public CmsFriendlink updateByUpdater(Updater<CmsFriendlink> updater);

	public CmsFriendlink deleteById(Integer id);
}