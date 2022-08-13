package com.sukai.dictionarymanagement.region.mapper;

import com.sukai.dictionarymanagement.region.entity.Region;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoreRegionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}