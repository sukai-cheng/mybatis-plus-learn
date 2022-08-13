package com.sukai.dictionarymanagement.province.mapper;

import com.sukai.dictionarymanagement.province.entity.D404Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface D404ProvinceMapper {
    int insert(D404Province record);

    int insertSelective(D404Province record);

    List<D404Province> findAll();
}