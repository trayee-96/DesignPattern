
public class CarClient {

	public static void main(String[] args) {
		System.out.println(CarFactory.BuildCar(CarType.Micro, Location.USA));
		System.out.println(CarFactory.BuildCar(CarType.Mini, Location.INDIA));
		System.out.println(CarFactory.BuildCar(CarType.Luxury, Location.Default));
	}

}
