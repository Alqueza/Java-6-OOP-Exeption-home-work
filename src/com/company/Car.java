package com.company;

public class Car implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("car is close");
    }

    public void drive() throws Exception {
        System.out.println("car is moving");
    }

}
