import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car{
	private static final Logger LOGGER=LoggerFactory.getLogger(MiniCar.class);
	public MiniCar(Location location) {
		super(CarType.Mini, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to mini car from:"+location);
	}

}
