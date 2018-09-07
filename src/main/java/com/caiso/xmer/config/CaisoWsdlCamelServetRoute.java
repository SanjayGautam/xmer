package com.caiso.xmer.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component()
public class CaisoWsdlCamelServetRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("servlet:///jaxbMdsReceiveServiceServlet").routeId("fromJaxbServlet").routeGroup("caiso-wsdls")
				.to("bean:beanJaxb2process").onException(Exception.class)
				.description("TO Handle Exceptiosn occured").log("Message Exception occured");

	}

}
