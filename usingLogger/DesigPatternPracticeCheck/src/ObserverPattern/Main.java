package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		INotificationObserver obj = new JohnObserver();
		INotificationObserver obj1 = new SteveObserver();
		INotificationService service = new NotificationService();
		service.addSubscriber(obj);
		service.addSubscriber(obj1);
		service.NotifySubscriber();
		service.removeSubscriber(obj1);

	}

}
