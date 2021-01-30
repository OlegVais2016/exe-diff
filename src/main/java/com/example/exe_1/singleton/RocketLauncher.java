package com.example.exe_1.singleton;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
//@Lazy
public class RocketLauncher {

    @PostConstruct
    private void unit(){
        System.out.println("Rocket launcher delivered");
    }

    public void detonation(){
        System.out.println("bang!");
    }
}
