package com.sukai.dictionarymanagement.region.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private static final long serialVersionUID = 1L;
}