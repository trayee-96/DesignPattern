
public class BasicUser implements IUser{
private ChatMediator mediator;
private String name;
public ChatMediator getMediator() {
	return mediator;
}
public String getName() {
	return name;
}
public BasicUser(ChatMediator mediator, String name) {
	super();
	this.mediator = mediator;
	this.name = name;
}
@Override
public void SendMessage(String msg) {
	mediator.SendMessage(msg);
}
@Override
public void ReceiveMessage(String msg) {
	System.out.println(msg+": received by Basic user: "+getName());
}


}
