package weekfive;

public class encapsulation {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstname("Sally");
		
		
		student.setPhoneNumber("206-883-7641");
	
		student.introduce();
		
		
		
		rectangle rec = new rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());

	/*  Access modifiers:
	 * public - accessible everywhere
	 * private - only accessible within the class itself
	 * protected - only accessible within the class, other classes in the same package, and all subclasses 
	 * No Modifier- same as protected, except not accessible in a subclass in a different package  
	 *  	
	 *  two most common are public and private 
	 *  
	 *  getters and setters- you can add logic 
	 *  
	 *  The reason for using getters and setters instead of making your members public is that it makes it
	 *  possible to change the implementation without changing the interface. Also, many tools and toolkits 
	 *  that use reflection to examine objects only accept objects that have getters and setters.
	 *  
	 *  
	 */
	

	}
}
