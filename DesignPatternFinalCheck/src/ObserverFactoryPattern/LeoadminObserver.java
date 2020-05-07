package ObserverFactoryPattern;

public class LeoadminObserver implements INotificationObserver{
private String name;
private int NoOfTickets;

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
		System.out.println("more than 100 tickets has been booked: received by "+name);
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
