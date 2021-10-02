package co.pragra.leaening.springsession2.conf;

import co.pragra.leaening.springsession2.domain.SuperCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SuperCarConfig {

    @Bean
    public SuperCar superCar(){
      return SuperCar.getSuperCar();
    }
}
