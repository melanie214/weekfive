package weekfive;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
		// TODO Auto-generated constructor stub
		
		//super keyword refers the class you are inheriting from 
	}

	@Override
	public double calculatePay() {
		return this.getPay() * 80;
	}
	
	
}
