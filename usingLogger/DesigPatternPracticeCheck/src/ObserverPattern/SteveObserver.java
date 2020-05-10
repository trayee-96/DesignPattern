package ObserverPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver{
public String Name="Steve";
private static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);
	@Override
	public void OnServerDown() {
		LOGGER.info("Notification has been received by "+Name);
	}
	@Override
	public String toString() {
		return "SteveObserver [Name=" + Name + "]";
	}

}
