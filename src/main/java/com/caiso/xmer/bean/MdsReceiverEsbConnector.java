package com.caiso.xmer.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("beanJaxb2process")
public class MdsReceiverEsbConnector implements Processor {

	private final Logger logger = LoggerFactory.getLogger(MdsReceiverEsbConnector.class);

	
	public void process(Exchange exchange) throws Exception {
		
		
			System.out.println("************* sdfsdfdsfsdf" + exchange.getFromEndpoint().getEndpointUri());
			System.out.println("************* sdfsdfdsfsdf");
		
		
	}

	

}

