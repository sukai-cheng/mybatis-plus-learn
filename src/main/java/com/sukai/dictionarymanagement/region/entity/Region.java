package com.sukai.dictionarymanagement.region.entity;

import com.sukai.dictionarymanagement.city.entity.D404City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region implements Serializable {
    private Long id;

    private String regionCode;

    private String regionNameCn;

    private String regionNameEn;

    private Date regionStartDate;

    private Date regionStopDate;

    private String provinceCode;

    private String regionNameUr;

    private List<D404City> cityList;

    private static final long serialVersionUID = 1L;
}