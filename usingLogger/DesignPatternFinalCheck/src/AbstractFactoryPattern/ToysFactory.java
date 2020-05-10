package AbstractFactoryPattern;

public class ToysFactory extends AbstractOrderFactory {

	@Override
	public Order getProduct(Channel channel) {
		return new ToysOrder(channel);
	}

}
