package AbstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToysOrder extends Order{
	private static final Logger LOGGER = LoggerFactory.getLogger(ToysOrder.class);
	public ToysOrder(Channel channel) {
		super(channel,ProductType.Toys);
		processOrder();
	}
	@Override
	public void processOrder() {
		LOGGER.info("Toy order is being processed for: "+channel);
	}

}
