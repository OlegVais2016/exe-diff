package com.example.setdata.service;

import com.example.setdata.model.DataInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class DataSender {

    @Autowired
    private ApplicationContext context;

    Map<Integer,ISendingType> mailing = new HashMap<>();

    @PostConstruct
    private void init() {
        Map<String,ISendingType> typesMap = context.getBeansOfType(ISendingType.class);
        typesMap.forEach((name, bean) -> mailing.put(bean.getNumber(),bean));
    }

    public String sendData(DataInfo dataInfo){
        ISendingType iSendingType = mailing.get(dataInfo.getSendingType());
        if(iSendingType == null) {
            return "Incorrect sending type";
        } else {
            return	iSendingType.send(dataInfo.getAddress(), dataInfo.getText());
        }
    }








}
