package com.sukai.dictionarymanagement.province.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class D404Province implements Serializable {
    private Long id;

    private String provinceCode;

    private String provinceNameCn;

    private String provinceNameDj;

    private String provinceNameEn;

    private String provinceNameEt;

    private Date provinceStartDate;

    private Date provinceStopDate;

    private String countryCode;

    private String provinceNameUr;

    private static final long serialVersionUID = 1L;
}