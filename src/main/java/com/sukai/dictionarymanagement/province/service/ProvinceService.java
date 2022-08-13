package com.sukai.dictionarymanagement.province.service;

import com.sukai.dictionarymanagement.province.entity.D404Province;
import com.sukai.dictionarymanagement.province.mapper.D404ProvinceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 11:35
 */
@Service
public class ProvinceService {

    @Resource
    D404ProvinceMapper provinceMapper;

    public List<D404Province> findAll(){
        return provinceMapper.findAll();
    }
}
