import java.util.Scanner;
import java.text.DecimalFormat;

public class AdvertisementandMarketing {
	
	Scanner in = new Scanner(System.in);
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
		month = in.nextLine();
		
		System.out.println("\nBest Selling of the Month:" + bSname);
		bSname = in.nextInt();
		
		System.out.println("\nNew Arrival of the Month:" + nAname);
		nAname = in.nextInt();
		
		System.out.println("\nTotal Clothing Rented:" + nClothing);
		nClothing = in.nextInt();
	}	

	public void rentalReport(){
		System.out.print("\nRental report for month:" + month +
		                 "\n" +
		                 "\nBest Selling of the Month:" + bSname +
		                 "\nNew Arrival of the Month:" + nAname +
		                 "\nTotal Clothing Rented:" + nClothing);
	}
	
}
