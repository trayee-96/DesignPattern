import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car{
	private static final Logger LOGGER=LoggerFactory.getLogger(LuxuryCar.class);
	public LuxuryCar(Location location) {
		super(CarType.Luxury, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to luxury car from:"+location);
	}

}
