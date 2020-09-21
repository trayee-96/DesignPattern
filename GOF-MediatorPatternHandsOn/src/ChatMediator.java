import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{
public List<IUser> users;
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}
	

	public ChatMediator() {
		super();
		users=new ArrayList<>();
	}


	@Override
	public void SendMessage(String msg) {
		for(IUser u:users) {
			u.ReceiveMessage(msg);
		}
	}

}
