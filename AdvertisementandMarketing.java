import java.util.Scanner;
import java.text.DecimalFormat;

public class AdvertisementandMarketing {
	
	Scanner input = new Scanner(System.in);
	static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	String bestSelling;
	String newArrival;
	String month;
	int nClothing;
	double bSname, nAname;

	public AdvertisementandMarketing(String bS, String nA) {
		bestSelling = bS;
		newArrival = nA;
		
		System.out.println("\nInput specific month:" + month);
		month = input.nextLine();
		
		System.out.println("\nBest Selling of the Month:" + bSname);
		bSname = input.nextInt();
		
		System.out.println("\nNew Arrival of the Month:" + nAname);
		nAname = input.nextInt();
		
		System.out.println("\nTotal Clothing Rented:" + nClothing);
		nClothing = input.nextInt();
	}	

	public void rentalReport(){
		System.out.print("\nRental report for month:" + month);
		System.out.println("\n");
		System.out.println("\nBest Selling of the Month:" + bSname);
		System.out.println("\nNew Arrival of the Month:" + nAname);
		System.out.println("\nTotal Clothing Rented:" + nClothing);
	}
	
}
