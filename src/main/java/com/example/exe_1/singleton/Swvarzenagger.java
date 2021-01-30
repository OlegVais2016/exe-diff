package com.example.exe_1.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Swvarzenagger {

    @Autowired
         //   @Lazy
    RocketLauncher rocketLauncher;


    @EventListener(ContextRefreshedEvent.class)
    public void start(){
        System.out.println(rocketLauncher.getClass());
        if(enemiesLessThan100()){
            beatLog();
        }
        else {
            rocketLauncher.detonation();

        }
    }

    private void beatLog(){
        System.out.println("pum! pum!");
    }

    private boolean enemiesLessThan100(){
        return true;
    }
}
