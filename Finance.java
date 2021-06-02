import java.util.Scanner;

public class Finance {
	
	Scanner in = new Scanner(System.in);
	
	double totalSales;
	double totalExpenses;
	double TotalProfit;
	String month;
	
	public Finance(double tS, double tE) {
		totalSales = tS;
		totalExpenses = tE;
		
		System.out.println("\n---------------Finance System---------------");
		
		System.out.print("\nEnter month : ");
		month = in.nextLine();
	}
	
	public double calcTotalIncome() {
		return TotalProfit = totalSales - totalExpenses;
	}
	
	public void financialReport() {
		System.out.println("\nFinancial Report for:" + month +
				"\n------------------------------------------------------------" +
				"\nTotal Sales: RM " + totalSales +
				"\nTotal Expenses: RM " + totalExpenses +
				"\nFinal Income: RM " + calcTotalIncome() +
				"\n------------------------------------------------------------");
		
	}
	
}
