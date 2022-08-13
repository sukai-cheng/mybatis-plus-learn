package com.sukai.dictionarymanagement.country.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chengsukai
 * @since 2022-08-13 14:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryRequest implements Serializable {

    private Long id;

    private String countryCode;

    private String countryCurrency;

    private String countryNameCn;

    private String countryNameDj;

    private String countryNameEn;

    private String countryNameEt;
}
