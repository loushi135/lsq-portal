package com.portal.cms.dao.main;

import net.sf.ehcache.Ehcache;

import com.portal.cms.entity.main.ChannelCount;
import com.portal.common.hibernate3.Updater;

public interface ChannelCountDao {
	public int clearCount(boolean week, boolean month);

	public int freshCacheToDB(Ehcache cache);

	public ChannelCount findById(Integer id);

	public ChannelCount save(ChannelCount bean);

	public ChannelCount updateByUpdater(Updater<ChannelCount> updater);
}