
public class CarFactory {
	
public static AbstractCarFactory getFactory(Location location) {
	if( location==Location.Default) {
	return new DefaultcarFactory();
}
	else if(location==Location.USA)
		return new UsaCarFactory();
	else
		return new IndiaCarFactory();
}
public static Car BuildCar(CarType model,Location location) {
	return getFactory(location).getCar(model);
}
}
