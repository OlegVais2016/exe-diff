package com.example.setdata.model;

import lombok.*;




@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataInfo {

    private Address address;
    private String text;
    private Integer sendingType;
}
