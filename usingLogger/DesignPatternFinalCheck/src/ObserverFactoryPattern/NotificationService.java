package ObserverFactoryPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService{
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	List<INotificationObserver> observers;
	
	public NotificationService() {
		super();
		observers=new ArrayList<>();
	}

	@Override
	public void subscribe(INotificationObserver observer) {
		observers.add(observer);
		for (INotificationObserver observer1 : observers) {
			LOGGER.info(observer1.toString());
		}
		
	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		observers.remove(observer);
		for (INotificationObserver Observer : observers) {
			LOGGER.info(Observer.toString());
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
