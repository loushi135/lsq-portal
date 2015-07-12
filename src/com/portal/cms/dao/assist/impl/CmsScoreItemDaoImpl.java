package com.portal.cms.dao.assist.impl;

import org.springframework.stereotype.Repository;

import com.portal.common.hibernate3.Finder;
import com.portal.common.hibernate3.HibernateBaseDao;
import com.portal.common.page.Pagination;
import com.portal.cms.dao.assist.CmsScoreItemDao;
import com.portal.cms.entity.assist.CmsScoreItem;

@Repository
public class CmsScoreItemDaoImpl extends HibernateBaseDao<CmsScoreItem, Integer> implements CmsScoreItemDao {
	public Pagination getPage(Integer groupId,int pageNo, int pageSize) {
		String hql="from CmsScoreItem item ";
		Finder f=Finder.create(hql);
		if(groupId!=null){
			f.append(" where item.group.id=:groupId").setParam("groupId", groupId);
		}
		return find(f, pageNo, pageSize);
	}

	public CmsScoreItem findById(Integer id) {
		CmsScoreItem entity = get(id);
		return entity;
	}

	public CmsScoreItem save(CmsScoreItem bean) {
		getSession().save(bean);
		return bean;
	}

	public CmsScoreItem deleteById(Integer id) {
		CmsScoreItem entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<CmsScoreItem> getEntityClass() {
		return CmsScoreItem.class;
	}
}