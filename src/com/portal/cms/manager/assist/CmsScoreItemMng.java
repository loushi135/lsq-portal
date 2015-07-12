package com.portal.cms.manager.assist;

import com.portal.common.page.Pagination;
import com.portal.cms.entity.assist.CmsScoreItem;

public interface CmsScoreItemMng {
	public Pagination getPage(Integer groupId,int pageNo, int pageSize);

	public CmsScoreItem findById(Integer id);

	public CmsScoreItem save(CmsScoreItem bean);

	public CmsScoreItem update(CmsScoreItem bean);

	public CmsScoreItem deleteById(Integer id);
	
	public CmsScoreItem[] deleteByIds(Integer[] ids);
}