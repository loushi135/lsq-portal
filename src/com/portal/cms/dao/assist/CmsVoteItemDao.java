package com.portal.cms.dao.assist;

import com.portal.cms.entity.assist.CmsVoteItem;
import com.portal.common.hibernate3.Updater;
import com.portal.common.page.Pagination;

public interface CmsVoteItemDao {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsVoteItem findById(Integer id);

	public CmsVoteItem save(CmsVoteItem bean);

	public CmsVoteItem updateByUpdater(Updater<CmsVoteItem> updater);

	public CmsVoteItem deleteById(Integer id);
}