package org.example.component;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;

@Component("abc")
public class AnotherBeanConfigComponent extends JmsComponent {
	
	@Metadata(label = "advanced", description = "To use a shared JMS configuration")
	private BeanConfiguration someAdditionalConfig;

	public AnotherBeanConfigComponent() {
	}

	public AnotherBeanConfigComponent(CamelContext context) {
		super(context);
	}

	public AnotherBeanConfigComponent(JmsConfiguration configuration) {
		super(configuration);
	}
	
	public BeanConfiguration getSomeAdditionalConfig() {
		return someAdditionalConfig;
	}
	
	public void setSomeAdditionalConfig(BeanConfiguration someAdditionalConfig) {
		this.someAdditionalConfig = someAdditionalConfig;
	}
}
