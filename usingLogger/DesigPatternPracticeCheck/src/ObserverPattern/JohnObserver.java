package ObserverPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver{

	public String Name="John";
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);
	@Override
	public void OnServerDown() {
		LOGGER.info("Notification has been received by "+Name);
	}
	@Override
	public String toString() {
		return "JohnObserver [Name=" + Name + "]";
	}

}
