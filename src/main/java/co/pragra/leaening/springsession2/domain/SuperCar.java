package co.pragra.leaening.springsession2.domain;

import lombok.ToString;

@ToString
public class SuperCar {
    private String name;



    public static SuperCar getSuperCar(){
        return new SuperCar();
    }
}
