package com.sukai.dictionarymanagement.country.controller;

import com.sukai.configuration.HttpResult;
import com.sukai.dictionarymanagement.country.entity.D403Country;
import com.sukai.dictionarymanagement.country.request.CountryRequest;
import com.sukai.dictionarymanagement.country.service.CountryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 11:53
 */
@RestController
@RequestMapping("/country")
public class CountryController {

    @Resource(name = "countryServiceImpl")
    CountryService countryService;

    @GetMapping("/getAll")
    public List<D403Country> getAll() {
        return countryService.findAll();
    }

    @PostMapping("/saveOne")
    public int saveOne(@RequestBody CountryRequest countryRequest) {
        return countryService.insert(countryRequest);
    }

    @PostMapping("/updateOne")
    public int updateOne(@RequestBody CountryRequest countryRequest) {
        return countryService.update(countryRequest);
    }

    @PostMapping("/deleteOne")
    public int deleteOne(@RequestBody CountryRequest countryRequest) {
        return countryService.delete(countryRequest);
    }

    @PostMapping("/findByCountryName")
    public HttpResult<D403Country> findByCountryName(@RequestBody CountryRequest countryRequest) {
        return HttpResult.success(countryService.findByCountryName(countryRequest.getCountryCode()));
    }
}
