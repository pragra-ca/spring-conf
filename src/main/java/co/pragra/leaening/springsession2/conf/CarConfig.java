package co.pragra.leaening.springsession2.conf;

import co.pragra.leaening.springsession2.domain.Car;
import co.pragra.leaening.springsession2.domain.DieselEngine;
import co.pragra.leaening.springsession2.domain.PetroEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:car.properties")
public class CarConfig {

    @Bean
    public DieselEngine diselEngine(){
        return new DieselEngine();
    }


    @Bean
    public PetroEngine petrolEngine(){
        return new PetroEngine();
    }


    @Bean
    public Car car(){
        Car car = new Car();
        return car;
    }
}
