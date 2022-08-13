package com.sukai.dictionarymanagement.city.controller;

import com.sukai.configuration.HttpResult;
import com.sukai.dictionarymanagement.region.entity.Region;
import com.sukai.dictionarymanagement.region.service.RegionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 16:58
 */
@RestController
@RequestMapping("/region")
public class RegionController {
    @Resource(name = "RegionServiceImpl")
    private RegionService regionService;

    @GetMapping("/findRegionAndCities")
    public HttpResult<List<Region>> findRegionAndCities() {
        List<Region> regions = regionService.selectAllRegionAndCities();
        return HttpResult.success(regions);
    }
}
