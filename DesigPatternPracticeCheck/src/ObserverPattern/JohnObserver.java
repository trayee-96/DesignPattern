package ObserverPattern;

public class JohnObserver implements INotificationObserver{

	public String Name="John";
	@Override
	public void OnServerDown() {
		System.out.println("Notification has been received by "+Name);
	}
	@Override
	public String toString() {
		return "JohnObserver [Name=" + Name + "]";
	}

}
