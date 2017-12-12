package com.lcf.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyResourceConfig extends ResourceConfig {
	public JerseyResourceConfig() {
		packages("com.lcf.demo.control");
	}
}
