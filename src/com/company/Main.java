package com.company;

public class Main {

    public static void main(String[] args) {
        try (Car car1= new Car()){
            car1.drive();
        }catch  (Exception e){
            e.getMessage();
        }
    }
}