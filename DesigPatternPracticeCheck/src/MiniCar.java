
public class MiniCar extends Car{

	public MiniCar(Location location) {
		super(CarType.Mini, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to mini car");
	}

}
