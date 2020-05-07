package ObserverFactoryPattern;

public class SmithadminObserver implements INotificationObserver{

	private String name;
	private int noOfTickets;
	
	public SmithadminObserver(int noOfTickets) {
		super();
		this.name="Smith";
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void onTicketBooked() {
		System.out.println("more than 100 tickets has been booked: received by "+name);
	}
	@Override
	public String toString() {
		return "SmithadminObserver [name=" + name + "]";
	}
	@Override
	public int getNoOfTickets() {
		// TODO Auto-generated method stub
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	

}
