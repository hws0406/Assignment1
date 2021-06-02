import java.util.Scanner;

public class Sales {
	
	Scanner in = new Scanner(System.in);
	
	String name;
	String date;
	String style;
	int days, quantity;
	double price;
	double pricePerDay;
	double payment;
	double balance;
	
	
	public Sales() {
		System.out.println("\nEnter your name:" + name);
		name = in.nextLine();
		
		System.out.println("\nEnter date:" + date);
		date = in.nextLine();
		
		System.out.println("\nKinds of clothing available: Dress, Jumpsuit, Jacket, Playsuit, Sets & Suits" + style);
		style = in.nextLine();
		
		System.out.print("\nEnter rental days:" + days);
		days = in.nextInt();
		
		System.out.println("\nEnter quantities" + quantity);
		quantity = in.nextInt();
		
		if (quantity <= 10){
			System.out.println("\nThe price per day is: "+ pricePerDay);
			System.out.println("\nThe total price is:" + price + "for" + days);
			}
			
			else if (quantity >10) {
				System.out.println("\nThe price per day is: "+ pricePerDay);
				System.out.println("\nThe total price is:" + price + "for" + days);
				}
		
			else {
				System.out.println("Invalid. Please reenter.");
				}
		
		System.out.print("Enter payment: RM");
		payment = in.nextDouble();
		}
	
	public void calculateTotalPrice() {
		price = pricePerDay * days;
		}
	
	public void calcBalance() {
		balance = payment - price;
		}
	
	public void receipt() {
		System.out.println("\nReceipt" +
				"\n-----------------------------------------------------" +
				"\nName:" + name +
				"\nDate:" + date +
				"\nStyle:" + style +
				"\nQuantity:" + quantity + 
				"\nPrice /day:" + pricePerDay +
				"\nTotal Days:" + days + "days" +
				"\nTotal Price:" + price +
				"\nTotal Payment: RM " + payment +
				"\nBalance: RM " + balance +
				"\n------------------------------------------------------------" +
		        "--------Thank You for Purchasing from us--------");				
		}
	}
