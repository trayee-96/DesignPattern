package AbstractFactoryPattern;

public class FurnitureFactory extends AbstractOrderFactory {

	@Override
	public Order getProduct(Channel channel) {
		return new FurnitureOrder(channel);
	}

}
