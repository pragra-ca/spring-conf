package co.pragra.leaening.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class Car {

    @Value("#{${car.make}.trim()}")
    private String make;
    @Value("#{ new String('F150')}")
    private String model;

    @Autowired
    @Qualifier("petrolEngine")
    private Engine engine;

    @PostConstruct
    public void startCar(){
        System.out.println("Start engine   " + engine.getEngineType());
    }

    @PreDestroy
    public void stopCar(){
        System.out.println("Stop engine  " + engine.getEngineType());
    }
}
