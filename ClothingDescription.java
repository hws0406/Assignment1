import java.util.Scanner;	
public class ClothingDescription {
	
	Scanner input = new Scanner(System.in);
	
	String clothingName, size;
	int maxPeriod;
	double pricePerDay;
	
	public ClothingDescription(String n, double ppd) {
		this.clothingName = n;
		this.size = "S, M, L, XL";
		this.pricePerDay = ppd;
		this.maxPeriod = 40;
	}
	
	public void printDescription() {
		System.out.println("\n==========Clothing Description==========");
		System.out.printf("Clothing:", this.clothingName);
		System.out.printf("Size:", this.size);
		System.out.printf("Price /day:", this.pricePerDay);
		System.out.printf("Max Rental Period:", this.maxPeriod );
	}
}
