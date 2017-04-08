package com.common;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.resource.ProductResoucce;

@ApplicationPath("/api")
public class MyApp extends ResourceConfig{
public MyApp() {
 register(new ProductResoucce());
}
}
