package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	public List<INotificationObserver> observers;
	
	public NotificationService() {
		observers = new ArrayList<>();
	}

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		observers.add(iNotificationObserver);
		for (INotificationObserver observer : observers) {
			System.out.println(observer);
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		for (INotificationObserver observer : observers) {
			System.out.println(observer);
		}
		
	}

	@Override
	public void NotifySubscriber() {
		for (INotificationObserver iNotificationObserver : observers) {
			iNotificationObserver.OnServerDown();
		}
	}

}
