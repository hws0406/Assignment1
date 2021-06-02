import java.util.Scanner;               

public class Main {                     
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to HWS Clothing Rental");
		System.out.println("-----------------------------------");
		
		ClothingRentalService crs = new ClothingRentalService("HWS Clothing Rental");
		System.out.println(crs);
		
		System.out.println("\n----------------------------------------");
		System.out.println("\n");
		System.out.println("Login");
		System.out.println("\n1 == Customer");
		System.out.println("2  == Admin");
		
		System.out.println("\nEnter 1 or 2 to login");
		String menuOption = in.nextLine();
		System.out.print("\n------------------------------------------");
		
		switch(menuOption) {
		case "1": 
			System.out.println("\nHi Dear Customer. \nGlad to have this wonderful chance to serve you. Thanks for choosing us! ");
			System.out.println("\nLets Start with choosing your prefer clothing");
			Sales s = new Sales();
			System.out.println(s);
			s.receipt();
	
		break;
		
		case "2": 
			System.out.println("Hi Admin! Please log in to access system info");
			System.out.println("Username:" );
			String username = in.next();
			System.out.println("Password:" );
			String password = in.next();
			
			if((username.equals("hws")) && (password.equals("hws@0406"))) {
				System.out.println("\nAdmin" + username + "Log In Successful!");
				System.out.print("\n------------------------------------------");
				
				String loginName = "hws";
                String position = "Admin";
				System.out.println("\nAdmin online: " + loginName + position);
				
				boolean admin = true;
				while(admin) {
					System.out.println("Choose one option to continue\n1. Advertisement and Marketing\n2. Inventory Management\n3. Employee Management\n4. Finance");
					int choice = in.nextInt();
					
					if(choice == 1) {
						AdvertisementandMarketing am = new AdvertisementandMarketing("Gowns","Hoodie");
						System.out.println(am);
					}
					
					if(choice == 2) {
						InventoryManagement im = new InventoryManagement(20,5);
						System.out.println(im);
					}
					
					if(choice == 3) {
						EmployeeManagement em = new EmployeeManagement();
						System.out.println(em);
					}
										
					if(choice == 4) {
						Finance f = new Finance(6000,3500);
						System.out.println(f);		
					}
					
					if(choice > 5) {
						System.out.println("\nWrong input! Please try again.");
						System.exit(0);
					}
					else {
						System.out.println("\nIncorrect username and password. Please Try again.");
						}
					break;
					}
				}
					
				else {
					System.out.println("Invalid input. Please enter again.");
				}
		}
	}
}

