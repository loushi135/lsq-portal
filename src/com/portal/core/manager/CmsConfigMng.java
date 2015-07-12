package com.portal.core.manager;

import java.util.Date;

import com.portal.core.entity.CmsConfig;
import com.portal.core.entity.CmsConfigAttr;
import com.portal.core.entity.MarkConfig;
import com.portal.core.entity.MemberConfig;

public interface CmsConfigMng {
	public CmsConfig get();

	public void updateCountCopyTime(Date d);

	public void updateCountClearTime(Date d);

	public CmsConfig update(CmsConfig bean);

	public MarkConfig updateMarkConfig(MarkConfig mark);

	public void updateMemberConfig(MemberConfig memberConfig);
	
	public void updateConfigAttr(CmsConfigAttr configAttr);
}