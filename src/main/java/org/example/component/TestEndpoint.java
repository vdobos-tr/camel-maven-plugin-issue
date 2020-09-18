package org.example.component;

import javax.jms.JMSException;
import javax.jms.Queue;

import org.apache.camel.Category;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.camel.component.jms.JmsQueueEndpoint;
import org.apache.camel.component.jms.QueueBrowseStrategy;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;

@ManagedResource(description = "Managed Test Endpoint")
@UriEndpoint(firstVersion = "1.0.0", scheme = "abc", title = "TST", syntax = "abc:destinationType:destinationName", category = {
		Category.MESSAGING })
public class TestEndpoint extends JmsQueueEndpoint {
	
	public TestEndpoint(Queue destination) throws JMSException {
		super(destination);
		// TODO Auto-generated constructor stub
	}

	public TestEndpoint(String endpointUri, String destination) {
		super(endpointUri, destination);
		// TODO Auto-generated constructor stub
	}

	public TestEndpoint(String endpointUri, String destination, QueueBrowseStrategy queueBrowseStrategy) {
		super(endpointUri, destination, queueBrowseStrategy);
		// TODO Auto-generated constructor stub
	}

	public TestEndpoint(String uri, JmsComponent component, String destination, JmsConfiguration configuration) {
		super(uri, component, destination, configuration);
		// TODO Auto-generated constructor stub
	}

	public TestEndpoint(String uri, JmsComponent component, String destination, JmsConfiguration configuration,
			QueueBrowseStrategy queueBrowseStrategy) {
		super(uri, component, destination, configuration, queueBrowseStrategy);
		// TODO Auto-generated constructor stub
	}

}
