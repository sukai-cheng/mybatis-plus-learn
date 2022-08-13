package com.sukai.dictionarymanagement.country.mapper;

import com.sukai.dictionarymanagement.country.domain.CountryDomain;
import com.sukai.dictionarymanagement.country.entity.D403Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface D403CountryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CountryDomain record);

    int insertSelective(D403Country record);

    D403Country selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(D403Country record);

    int updateByPrimaryKey(CountryDomain record);

    List<D403Country> findAll();

}