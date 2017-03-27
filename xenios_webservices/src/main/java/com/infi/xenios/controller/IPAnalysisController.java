package com.infi.xenios.controller;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.infi.xenios.common.entity.FileEntity;
import com.infi.xenios.service.FileManipulateService;

@Named
@Path("/analysis")
public class IPAnalysisController {

	@Autowired
	public FileManipulateService fileManipulateService;

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return "{msg : 'Hello World!'}";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/files")
	public List<FileEntity> getFiles() {
		return fileManipulateService.fileDetails();
	}

}
