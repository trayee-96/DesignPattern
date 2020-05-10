package ObserverFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import AbstractFactoryPattern.FurnitureOrder;

public class LeoadminObserver implements INotificationObserver{
private String name;
private int NoOfTickets;
private static final Logger LOGGER = LoggerFactory.getLogger(LeoadminObserver.class);
	public LeoadminObserver(int noOfTickets) {
	super();
	this.name = "Leo";
	NoOfTickets = noOfTickets;
}
	
	public void setNoOfTickets(int noOfTickets) {
		NoOfTickets = noOfTickets;
	}

	@Override
	public void onTicketBooked() {
		LOGGER.info("more than 100 tickets has been booked: received by "+name);
	}
	@Override
	public String toString() {
		return "LeoadminObserver [name=" + name + "]";
	}
	@Override
	public int getNoOfTickets() {
		// TODO Auto-generated method stub
		return NoOfTickets;
	}
	

}
