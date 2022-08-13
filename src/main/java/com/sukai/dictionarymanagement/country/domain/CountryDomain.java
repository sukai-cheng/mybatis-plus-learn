package com.sukai.dictionarymanagement.country.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chengsukai
 * @since 2022-08-13 14:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDomain implements Serializable {
    private String countryCode;

    private String countryCurrency;

    private String countryNameCn;

    private String countryNameDj;

    private String countryNameEn;

    private String countryNameEt;
}
