package com.portal.core.entity;

import com.portal.core.entity.base.BaseCmsUserSite;

public class CmsUserSite extends BaseCmsUserSite {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsUserSite () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsUserSite (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsUserSite (
		java.lang.Integer id,
		com.portal.core.entity.CmsUser user,
		com.portal.core.entity.CmsSite site,
		java.lang.Byte checkStep,
		java.lang.Boolean allChannel) {

		super (
			id,
			user,
			site,
			checkStep,
			allChannel);
	}

	/* [CONSTRUCTOR MARKER END] */

}