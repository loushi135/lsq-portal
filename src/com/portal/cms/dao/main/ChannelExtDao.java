package com.portal.cms.dao.main;

import com.portal.cms.entity.main.ChannelExt;
import com.portal.common.hibernate3.Updater;

public interface ChannelExtDao {
	public ChannelExt save(ChannelExt bean);

	public ChannelExt updateByUpdater(Updater<ChannelExt> updater);
}