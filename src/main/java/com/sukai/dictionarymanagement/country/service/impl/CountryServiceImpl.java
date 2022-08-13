package com.sukai.dictionarymanagement.country.service.impl;

import com.sukai.dictionarymanagement.country.domain.CountryDomain;
import com.sukai.dictionarymanagement.country.entity.D403Country;
import com.sukai.dictionarymanagement.country.mapper.D403CountryMapper;
import com.sukai.dictionarymanagement.country.request.CountryRequest;
import com.sukai.dictionarymanagement.country.service.CountryService;
import com.sukai.utils.CopyUtil;
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
    public D403Country findByCountryName(String countryName) {
        return countryMapper.findByCountryCode(countryName);
    }

    @Override
    public int insert(CountryRequest countryRequest) {

        CountryDomain countryDomain = CopyUtil.copy(countryRequest, CountryDomain.class);
        return countryMapper.insert(countryDomain);
    }

    @Override
    public int update(CountryRequest countryRequest) {
        CountryDomain countryDomain = CopyUtil.copy(countryRequest, CountryDomain.class);
        return countryMapper.updateByPrimaryKey(countryDomain);
    }

    @Override
    public int delete(CountryRequest countryRequest) {
        return countryMapper.deleteByPrimaryKey(countryRequest.getId());
    }

}
