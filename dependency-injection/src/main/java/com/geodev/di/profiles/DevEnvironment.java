package com.geodev.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevEnvironment implements EnvironmentService {

	public String getEnvironment() {
		return "Dev";
	}

}
