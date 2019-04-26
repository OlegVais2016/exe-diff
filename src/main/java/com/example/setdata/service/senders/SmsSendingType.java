package com.example.setdata.service.senders;

import com.example.setdata.model.Address;
import com.example.setdata.service.ISendingType;
import org.springframework.stereotype.Component;

@Component
public class SmsSendingType implements ISendingType {

    @Override
    public String send(Address address, String text) {
        return ("Send '" + text + "' by sms to number'" + address.getPhone() + "'!");
    }

    @Override
    public int getNumber() {
        return 2;
    }
}
