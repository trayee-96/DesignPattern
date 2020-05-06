
public class IndiaCarFactory extends AbstractCarFactory{

	@Override
	public Car getCar(CarType model) {
		if(model==CarType.Luxury)
		return new LuxuryCar(Location.INDIA);
		else if(model==CarType.Micro)
			return new MicroCar(Location.INDIA);
		else
			return new MiniCar(Location.INDIA);
	}

}
