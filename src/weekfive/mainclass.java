package weekfive;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		truck mytruck = new truck(); 
		mytruck.setYear(2016);
		mytruck.setModel("Ranger");
		mytruck.setMake("Ford");
		mytruck.setBedSize(6.5);
		
		
		
		
		Boat myboat = new Boat();
		myboat.setYear(1979);
		myboat.setModel("Supra");
		myboat.setMake("SuperBoat");
		
		PrintMMY(mytruck);
		PrintMMY(myboat);
		
		
		
		
		
		
	

	}
	
	public static void PrintMMY(Vehicle v)
	{
		System.out.println(v.getMake());
		System.out.println(v.getModel());
		System.out.println(v.getYear());
		
		
	}

}
