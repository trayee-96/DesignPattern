package com.cognizant.main;
import com.cognizant.audi.AudiFactory;
import com.cognizant.audi.AudiHeadlight;
import com.cognizant.audi.AudiTire;
import com.cognizant.factory.FactoryProducer;
import com.cognizant.mercedes.MercedesFactory;
import com.cognizant.mercedes.MercedesHeadlight;
import com.cognizant.mercedes.MercedesTire;

public class Main {

	public static void main(String[] args) {

		AudiFactory audiFactory = (AudiFactory) FactoryProducer.getFactory("audi");
		AudiTire audiTire = (AudiTire) audiFactory.makeTire();
		AudiHeadlight audiHeadlight = (AudiHeadlight) audiFactory.makeHeadlight();
		audiTire.show();
		audiHeadlight.show();
		MercedesFactory mercedesFactory = (MercedesFactory) FactoryProducer.getFactory("mercedes");
		MercedesTire MercedesTire = (MercedesTire) mercedesFactory.makeTire();
		MercedesHeadlight MercedesHeadlight = (MercedesHeadlight) mercedesFactory.makeHeadlight();
		 MercedesTire.show();
		 MercedesHeadlight.show();
	}

}
