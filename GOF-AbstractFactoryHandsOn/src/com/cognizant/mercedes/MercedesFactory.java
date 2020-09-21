package com.cognizant.mercedes;

import com.cognizant.abstractClass.Factory;
import com.cognizant.abstractClass.HeadLight;
import com.cognizant.abstractClass.Tire;

public class MercedesFactory extends Factory{

	@Override
	public HeadLight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
