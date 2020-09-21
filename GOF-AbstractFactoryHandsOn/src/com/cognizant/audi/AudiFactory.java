package com.cognizant.audi;

import com.cognizant.abstractClass.Factory;
import com.cognizant.abstractClass.HeadLight;
import com.cognizant.abstractClass.Tire;

public class AudiFactory extends Factory{

	@Override
	public HeadLight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

}
