package com.caiso.xmer.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class CamelConfig {

	@Bean
	public ServletRegistrationBean<DispatcherServlet> dispatcherRestServlet(ApplicationContext applicationContext) {
		DispatcherServlet servlet = new DispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		return new ServletRegistrationBean(servlet, "/*");
	}
	
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
	    ServletRegistrationBean servlet = new ServletRegistrationBean
	      (new CamelHttpTransportServlet(), "/camel/*");
	    servlet.setName("CamelServlet");
	    return servlet;
	}
	

}
