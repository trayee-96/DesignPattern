
public class Client {

	public static void main(String[] args) {
    ChatMediator chatMediator=new ChatMediator();
    chatMediator.AddUser(new BasicUser(chatMediator,"Akash"));
    chatMediator.AddUser(new BasicUser(chatMediator,"Sukanya"));
    chatMediator.AddUser(new BasicUser(chatMediator,"Subha"));
    chatMediator.AddUser(new PremiumUser("Ritu",chatMediator));
    String admin="Anindita";
    IUser user=new PremiumUser(admin,chatMediator);
    String msg="You can leave the office for now! Thank you...";
    System.out.println("message send by "+admin );
    chatMediator.SendMessage(msg);
	}

}
