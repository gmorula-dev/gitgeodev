package com.geodev.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware {

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Bean name {}", name);
	}

	/**
	 *  Se ejecutará después de la inyección de dependencias
	 */
	@PostConstruct
	public void init( ) {
		log.info("Post construct");
	}
	
	/**
	 *  Se ejecutará antes de que el Bean sea destruido
	 *  No se ejecutan para beans prototype
	 *  Solo se ejecutan durante una terminación de la VM de forma normal
	 */
	@PreDestroy
	public void destroy() {
		log.info("Pre destroy");
	}
	
}

