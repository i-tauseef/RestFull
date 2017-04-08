package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResoucce {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/names/{name}")
	public String getProduct(@PathParam("name") String id) {
		return "name" + id;
	}
	
	@Path("/sub")
	public Object getSubProducts(){
		return new subResource();
	}
}
