package com.geodev.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvironment implements EnvironmentService {

	public String getEnvironment() {
		return "Prod";
	}

}
