
public class MicroCar extends Car {
	MicroCar(Location location) {
		super(CarType.Micro, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to MicroCar");
	}
}
