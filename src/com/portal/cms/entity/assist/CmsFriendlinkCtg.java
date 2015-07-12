package com.portal.cms.entity.assist;

import com.portal.cms.entity.assist.base.BaseCmsFriendlinkCtg;



public class CmsFriendlinkCtg extends BaseCmsFriendlinkCtg {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsFriendlinkCtg () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsFriendlinkCtg (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsFriendlinkCtg (
		java.lang.Integer id,
		com.portal.core.entity.CmsSite site,
		java.lang.String name,
		java.lang.Integer priority) {

		super (
			id,
			site,
			name,
			priority);
	}

/*[CONSTRUCTOR MARKER END]*/


}