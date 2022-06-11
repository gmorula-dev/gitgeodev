package com.geodev.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.geodev.di.atributo.Coche;

@SpringBootApplication
public class DependencyInjectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		Coche coche = context.getBean(Coche.class);
		
		System.out.println(coche);
//		log.info("Animal nombre = {} edad = {}", animal.getNombre(), animal.getEdad());
	}

}
