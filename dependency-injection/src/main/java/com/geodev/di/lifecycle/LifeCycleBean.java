package com.geodev.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") -- Recordemos que predestroy no se ejecuta para beans de tipo prototype
@Lazy() //Si el bean es lazy no se inicializara a menos que se inyecte
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	/**
	 * Se ejecuta durante la construccion del bean "BeanNameAward"
	 */
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
	public void destroyBean() {
		log.info("Pre destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set method");
		
	}	
	
	@Override
	public void destroy() throws Exception {
		log.info("Destroy method");
		
	}


	
	
	
}

