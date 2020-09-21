import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to our site! Would you like to order or repair?");
		
		String processOption=sc.nextLine();
		String productDetails="";
		
		
		switch(processOption) {
		case "order":
			IPhoneOrder order=new IPhoneOrder();
			System.out.println("Please provide the phone model name");
			productDetails =sc.nextLine().trim();
			order.ProcessOrder(productDetails);
			break;
		case "repair":
			Repair phoneOrderRepair=new Repair();
			System.out.println("Is it the phone or accessory that you want to be repaired?");
			String productType=sc.nextLine().toLowerCase();
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetails=sc.nextLine().trim();
				phoneOrderRepair.ProcessPhoneRepair(productDetails);
				break;
			}
			else
			{
				System.out.println("Please provide the accessory detail,like headphone,tempered glass");
			    productDetails=sc.nextLine().trim();
			    phoneOrderRepair.ProcessAccessoryRepair(productDetails);
			}
			break;
		default:
				break;
		
		}
	}

}
