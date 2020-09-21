import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAdapter {
	Movable bugattiVeyron = new BugattiVeyron();
	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	@Test
	public void whenConvertingUSsdToEuro_thenSuccessfullyConverted() {
		assertEquals(bugattiVeyronAdapter.getPrice(), 182, 0.001);
	}

}
