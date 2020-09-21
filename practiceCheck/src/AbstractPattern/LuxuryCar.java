
public class LuxuryCar extends Car{

	public LuxuryCar(Location location) {
		super(CarType.Luxury, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to luxury car");
	}

}
