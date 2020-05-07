package ObserverFactoryPattern;

public class Main {
public static void main(String[] args) {
	INotificationObserver obj1=new SmithadminObserver(95);
	INotificationObserver obj2=new LeoadminObserver(105);
	NotificationService service=new NotificationService();
	service.subscribe(obj1);
	service.subscribe(obj2);
    service.notifymsg();
    service.unsubscribe(obj1);
}
}
