
public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public Movable getLuxuryCars() {
		return luxuryCars;
	}

	public void setLuxuryCars(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}
    
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMphToKmph(luxuryCars.getSpeed());
	}

	public double convertMphToKmph(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		 return convertUsdToEuro(luxuryCars.getPrice());
	}

	private double convertUsdToEuro(double price) {
		return price * 0.91;
	}
}
