package com.example.setdata.service.senders;

import com.example.setdata.model.Address;
import com.example.setdata.service.ISendingType;
import org.springframework.stereotype.Component;

@Component
public class EMailSendingType implements ISendingType {

    @Override
    public String send(Address address, String text) {
        return ("Send '" + text + "' to eMail'" + address.getEMail() + "'!");
    }

    @Override
    public int getNumber() {
        return 1;
    }
}
