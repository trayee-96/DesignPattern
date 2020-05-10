

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CarClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(CarClient.class);
	public static void main(String[] args) {
		LOGGER.debug("CARFACTORY:",CarFactory.BuildCar(CarType.Micro, Location.USA));
		LOGGER.debug("CARFACTORY:",CarFactory.BuildCar(CarType.Mini, Location.INDIA));
		LOGGER.debug("CARFACTORY:",CarFactory.BuildCar(CarType.Luxury, Location.Default));
	}

}
