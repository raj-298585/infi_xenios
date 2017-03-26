package com.infi.xenios.config;

import javax.inject.Named;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
			this.property(ServerProperties.PROCESSING_RESPONSE_ERRORS_ENABLED, true);
			this.property(ServerProperties.TRACING, "ALL");
			this.property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
			String[] packages={"com.infi.xenios","org.glassfish.jersey.examples.multipart"};
			this.packages(packages);
			this.register(MultiPartFeature.class);
		}
	}
}
