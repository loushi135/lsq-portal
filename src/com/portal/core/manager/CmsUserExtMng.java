package com.portal.core.manager;

import com.portal.core.entity.CmsUser;
import com.portal.core.entity.CmsUserExt;

public interface CmsUserExtMng {
	public CmsUserExt save(CmsUserExt ext, CmsUser user);

	public CmsUserExt update(CmsUserExt ext, CmsUser user);
}