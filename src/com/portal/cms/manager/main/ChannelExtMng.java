package com.portal.cms.manager.main;

import com.portal.cms.entity.main.Channel;
import com.portal.cms.entity.main.ChannelExt;

public interface ChannelExtMng {
	public ChannelExt save(ChannelExt ext, Channel channel);

	public ChannelExt update(ChannelExt ext);
}