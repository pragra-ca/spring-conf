package co.pragra.leaening.springsession2;

import co.pragra.leaening.springsession2.conf.CarConfig;
import co.pragra.leaening.springsession2.domain.Car;
import co.pragra.leaening.springsession2.domain.SuperCar;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication

public class SpringSession2Application {

    public static void main(String[] args) {
       // SpringApplication.run(SpringSession2Application.class, args);
        // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        ApplicationContext  context = SpringApplication.run(SpringSession2Application.class, args);

        System.out.println(context.getBean("car", Car.class));

        System.out.println(context.getBean("superCar", SuperCar.class));

        ((ConfigurableApplicationContext) context).registerShutdownHook();
    }

}
