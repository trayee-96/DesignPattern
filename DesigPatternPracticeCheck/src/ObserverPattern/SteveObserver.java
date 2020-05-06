package ObserverPattern;

public class SteveObserver implements INotificationObserver{
public String Name="Steve";
	@Override
	public void OnServerDown() {
		System.out.println("Notification has been received by "+Name);
	}
	@Override
	public String toString() {
		return "SteveObserver [Name=" + Name + "]";
	}

}
