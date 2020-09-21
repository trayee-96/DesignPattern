
public class DefaultcarFactory extends AbstractCarFactory{

	@Override
	public Car getCar(CarType model) {
		if(model==CarType.Luxury)
			return new LuxuryCar(Location.Default);
			else if(model==CarType.Micro)
				return new MicroCar(Location.Default);
			else
				return new MiniCar(Location.Default);
	}

}
