package AbstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FurnitureOrder extends Order{
	private static final Logger LOGGER = LoggerFactory.getLogger(FurnitureOrder.class);
public FurnitureOrder(Channel channel) {
	super(channel,ProductType.Furniture);
	processOrder();
}
	@Override
	public void processOrder() {
		LOGGER.info("Furniture order is being processed for:"+channel);
	}

}
