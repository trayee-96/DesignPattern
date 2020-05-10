import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {
	private static final Logger LOGGER=LoggerFactory.getLogger(MicroCar.class);
	MicroCar(Location location) {
		super(CarType.Micro, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to MicroCar from:"+location);
	}
}
