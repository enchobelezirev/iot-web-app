package iot.air.quality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import iot.air.quality.controller.HelloController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
