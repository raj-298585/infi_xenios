package com.infi.xenios.controller;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Named
@Path("/analysis")
public class IPAnalysisController {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return "{msg : 'Hello World!'}";
	}

}
