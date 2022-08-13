package com.sukai.dictionarymanagement.region.service;

import com.sukai.dictionarymanagement.region.entity.Region;

import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 16:54
 */
public interface RegionService {
    List<Region> selectAllRegionAndCities();
}
