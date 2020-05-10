package AbstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Toys));
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Furniture));
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Electronics));
		
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Furniture));
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Toys));
		LOGGER.debug("Order factory:",OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Electronics));
	}

}
