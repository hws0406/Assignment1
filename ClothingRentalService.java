
public class ClothingRentalService {
	
	String name, address, contact, email;

	public ClothingRentalService(String name) {
		
		this.name = name;
		this.address = "117, Pusat Perdagangan Pontian, 82000 Pontian Johor";
		this.contact = "07-68704060";
		this.email = "hws4600@hotmail.com";		
	}
	
	public void printDecription() {
		System.out.println("\n===================About Us===================");
		System.out.printf("Company Name:", this.name);
		System.out.printf("Company Address:", this.address);
		System.out.printf("No H/P:", this.contact);
		System.out.printf("Email:", this.email);
	}
}
