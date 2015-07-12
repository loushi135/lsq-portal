package com.portal.cms.dao.main;

import com.portal.cms.entity.main.ChannelTxt;
import com.portal.common.hibernate3.Updater;

public interface ChannelTxtDao {
	public ChannelTxt findById(Integer id);

	public ChannelTxt save(ChannelTxt bean);

	public ChannelTxt updateByUpdater(Updater<ChannelTxt> updater);
}