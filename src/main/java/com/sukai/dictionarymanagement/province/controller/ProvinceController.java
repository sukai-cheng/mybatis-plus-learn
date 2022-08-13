package com.sukai.dictionarymanagement.province.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.sukai.dictionarymanagement.province.entity.D404Province;
import com.sukai.dictionarymanagement.province.service.ProvinceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-07-12 22:24
 */
@RequestMapping("/province")
@RestController //代码 return 的值作为 HTTP 请求的内容返回客户端
public class ProvinceController {

    @Resource(name = "provinceService")
    private ProvinceService provinceService;

    @GetMapping("/getAll")
    @DS("primary")
    public List<D404Province> getAll() {
        return provinceService.findAll();
    }
}
