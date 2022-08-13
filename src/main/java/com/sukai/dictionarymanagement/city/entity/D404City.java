package com.sukai.dictionarymanagement.city.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class D404City implements Serializable {
    private Long id;

    private String cityCode;

    private String cityNameCn;

    private String cityNameDj;

    private String cityNameEn;

    private String cityNameEt;

    private Date cityStartDate;

    private Date cityStopDate;

    private String regionCode;

    private String cityNameUr;

    private static final long serialVersionUID = 1L;
}