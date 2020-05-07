package ObserverFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationObserver> observers;
	
	public NotificationService() {
		super();
		observers=new ArrayList<>();
	}

	@Override
	public void subscribe(INotificationObserver observer) {
		observers.add(observer);
		for (INotificationObserver observer1 : observers) {
			System.out.println(observer1);
		}
		
	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		observers.remove(observer);
		for (INotificationObserver Observer : observers) {
			System.out.println(Observer);
		}
		
	}

	@Override
	public void notifymsg() {
		for (INotificationObserver iNotificationObserver : observers) {
			if(iNotificationObserver.getNoOfTickets()>=100)
			iNotificationObserver.onTicketBooked();
		}
		
	}

}
