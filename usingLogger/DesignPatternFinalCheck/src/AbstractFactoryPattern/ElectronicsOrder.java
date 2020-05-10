package AbstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectronicsOrder extends Order{
	private static final Logger LOGGER = LoggerFactory.getLogger(ElectronicsOrder.class);
	public ElectronicsOrder(Channel channel) {
		super(channel,ProductType.Electronics);
		processOrder();
	}

	@Override
	public void processOrder() {
    LOGGER.info("Electronics order is being processed for:"+channel);		
	}

}
