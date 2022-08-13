package com.sukai.dictionarymanagement.country.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class D403Country implements Serializable {
    private Long id;

    private String countryCode;

    private String countryCurrency;

    private String countryNameCn;

    private String countryNameDj;

    private String countryNameEn;

    private String countryNameEt;

    private static final long serialVersionUID = 1L;
}