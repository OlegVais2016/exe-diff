package com.example.di;

public interface Engine {
    boolean isStart();
}

class GasEngine implements Engine{

    @Override
    public boolean isStart() {
        return true;
    }
}

class Car{
    public void start(){
        Engine engine = new GasEngine();

        engine.isStart();

    }
}

class Car1{
    private Engine engine;

    public Car1(Engine engine) {
        this.engine = engine;
    }
    void doSmth(){
        engine.isStart();

    }
}