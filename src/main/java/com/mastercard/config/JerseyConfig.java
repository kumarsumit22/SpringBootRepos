package com.mastercard.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastercard.endpoint.CityEndpoint;

/**
 * @author JAI MATA DI
 *
 */
@Component
@ApplicationPath("/city")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(CityEndpoint.class);
	}
}
