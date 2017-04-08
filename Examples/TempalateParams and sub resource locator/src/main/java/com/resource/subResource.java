package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class subResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getsubproduct(){
		return "sbu resource";
	}
}
