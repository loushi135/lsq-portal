package com.portal.cms.statistic;

import java.util.List;
import java.util.Map;

import com.portal.cms.statistic.CmsStatistic.CmsStatisticModel;

public interface CmsStatisticSvc {
	public List<CmsStatistic> statisticByModel(int type,
			CmsStatisticModel statisticModel, Integer year, Integer month,
			Integer day, Map<String, Object> restrictions);
}
