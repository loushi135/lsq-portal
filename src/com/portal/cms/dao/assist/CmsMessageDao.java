package com.portal.cms.dao.assist;

import java.util.Date;
import com.portal.cms.entity.assist.CmsMessage;
import com.portal.common.hibernate3.Updater;
import com.portal.common.page.Pagination;

/**
 *江西金磊科技发展有限公司portal研发
 */
public interface CmsMessageDao {

	public Pagination getPage(Integer siteId, Integer sendUserId,
			Integer receiverUserId, String title, Date sendBeginTime,
			Date sendEndTime, Boolean status, Integer box, Boolean cacheable,
			int pageNo, int pageSize);

	public CmsMessage findById(Integer id);

	public CmsMessage save(CmsMessage bean);

	public CmsMessage updateByUpdater(Updater<CmsMessage> updater);
	
	public CmsMessage update(CmsMessage bean);

	public CmsMessage deleteById(Integer id);

	public CmsMessage[] deleteByIds(Integer[] ids);
}