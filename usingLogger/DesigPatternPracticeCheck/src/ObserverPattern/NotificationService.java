package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService{
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	public List<INotificationObserver> observers;
	
	public NotificationService() {
		observers = new ArrayList<>();
	}

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		observers.add(iNotificationObserver);
		for (INotificationObserver observer : observers) {
			LOGGER.info(observer.toString());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		for (INotificationObserver observer : observers) {
			LOGGER.info(observer.toString());
		}
		
	}

	@Override
	public void NotifySubscriber() {
		for (INotificationObserver iNotificationObserver : observers) {
			iNotificationObserver.OnServerDown();
		}
	}

}
