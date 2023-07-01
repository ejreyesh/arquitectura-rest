package net.ultrasist.capacitacion.arquitecturarest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.ultrasist.capacitacion.arquitecturarest.mappers")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}