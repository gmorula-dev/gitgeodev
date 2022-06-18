package com.geodev.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.geodev.di.autowire.AreaCalculatorService;
import com.geodev.di.lifecycle.LifeCycleBean;
import com.geodev.di.profiles.EnvironmentService;
import com.geodev.di.qualifiers.Nido;
import com.geodev.di.scopes.EjemploScopeService;

import ch.qos.logback.core.spi.LifeCycle;

@SpringBootApplication
public class DependencyInjectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	@Bean
	public String getApplicationName() {
		return "Geo Rulz!";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
	}

}
