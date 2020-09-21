
public class UsaCarFactory extends AbstractCarFactory{

	@Override
	public Car getCar(CarType model) {
		if(model==CarType.Luxury)
			return new LuxuryCar(Location.USA);
			else if(model==CarType.Micro)
				return new MicroCar(Location.USA);
			else
				return new MiniCar(Location.USA);
	}

}
