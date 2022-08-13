package com.sukai.dictionarymanagement.region.service.impl;

import com.sukai.dictionarymanagement.region.entity.Region;
import com.sukai.dictionarymanagement.region.mapper.CoreRegionMapper;
import com.sukai.dictionarymanagement.region.service.RegionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 16:55
 */
@Service("RegionServiceImpl")
public class RegionServiceImpl implements RegionService {

    @Resource
    CoreRegionMapper regionMapper;

    @Override
    public List<Region> selectAllRegionAndCities() {
        return regionMapper.selectAllRegionAndCities();
    }
}
