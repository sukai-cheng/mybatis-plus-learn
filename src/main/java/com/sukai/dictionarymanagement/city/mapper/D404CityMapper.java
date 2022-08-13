package com.sukai.dictionarymanagement.city.mapper;

import com.sukai.dictionarymanagement.city.entity.D404City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface D404CityMapper {
    int insert(D404City record);

    int insertSelective(D404City record);
}