
public class Main {

	public static void main(String[] args) {
		//get the object available in DBConn class
		DBConn object = DBConn.getInstance();
		object.showMessage();
	}

}
