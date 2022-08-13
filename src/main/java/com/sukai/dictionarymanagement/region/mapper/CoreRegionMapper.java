package com.sukai.dictionarymanagement.region.mapper;

import com.sukai.dictionarymanagement.region.entity.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoreRegionMapper {


    List<Region> selectAllRegionAndCities();

}