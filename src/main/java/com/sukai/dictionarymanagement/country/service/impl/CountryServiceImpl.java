package com.sukai.dictionarymanagement.country.service.impl;

import com.sukai.dictionarymanagement.country.domain.CountryDomain;
import com.sukai.dictionarymanagement.country.entity.D403Country;
import com.sukai.dictionarymanagement.country.mapper.D403CountryMapper;
import com.sukai.dictionarymanagement.country.request.CountryRequest;
import com.sukai.dictionarymanagement.country.service.CountryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 11:55
 */
@Service("countryServiceImpl")
public class CountryServiceImpl implements CountryService {

    @Resource
    D403CountryMapper countryMapper;

    @Override
    public List<D403Country> findAll() {
        return countryMapper.findAll();
    }

    @Override
    public int insert(CountryRequest countryRequest) {

        CountryDomain countryDomain = new CountryDomain();
        BeanUtils.copyProperties(countryRequest, countryDomain);
        return countryMapper.insert(countryDomain);
    }


}
