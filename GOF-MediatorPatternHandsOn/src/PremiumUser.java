
public class PremiumUser implements IUser{
private String name;
private ChatMediator mediator;
public String getName() {
	return name;
}

public ChatMediator getMediator() {
	return mediator;
}

public PremiumUser(String name, ChatMediator mediator) {
	super();
	this.name = name;
	this.mediator = mediator;
}

@Override
public void SendMessage(String msg) {
	mediator.SendMessage(msg);
}


@Override
public void ReceiveMessage(String msg) {
System.out.println(msg+": received by Premium User: "+getName());

}
}
