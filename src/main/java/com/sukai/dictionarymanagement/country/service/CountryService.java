package com.sukai.dictionarymanagement.country.service;

import com.sukai.dictionarymanagement.country.entity.D403Country;
import com.sukai.dictionarymanagement.country.request.CountryRequest;

import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 11:54
 */
public interface CountryService {
    List<D403Country> findAll();

    D403Country findByCountryName(String countryName);

    int insert(CountryRequest countryRequest);

    int update(CountryRequest countryRequest);

    int delete(CountryRequest countryRequest);
}
