package org.example.component;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

@UriParams
public class BeanConfiguration implements Cloneable {

		@UriParam(label="testparam", description="test param")
		private String additionalValue1;
		@UriParam(label="testparam", description="test param")
		private String additionalValue2;
		
		public BeanConfiguration() {}
		
		public String getAdditionalValue1() {
			return additionalValue1;
		}
		public void setAdditionalValue1(String additionalValue1) {
			this.additionalValue1 = additionalValue1;
		}
		public String getAdditionalValue2() {
			return additionalValue2;
		}
		public void setAdditionalValue2(String additionalValue2) {
			this.additionalValue2 = additionalValue2;
		}
		
		

}
