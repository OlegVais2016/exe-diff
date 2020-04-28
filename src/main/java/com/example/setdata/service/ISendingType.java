package com.example.setdata.service;

import com.example.setdata.model.Address;

public interface ISendingType {

    int getNumber();
    String send(Address address, String text);

}
