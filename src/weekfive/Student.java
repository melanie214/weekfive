package weekfive;

public class Student {
// name of this class is going to be Student 
	// we only need one main method, not all classes need it. 
	
	String firstName; 
	// we aren't going to assign a value to it, were just gonna terminate with ; because this is the blueprint 
	// were gonna create multiple students from this blueprint, each instance or object create from student class will have
	// its own first name 
	
	static int numberOfStudents; 
	
	// static is something that all students would share 
	
	String lastName; 
	String phoneNumber; 
	int gradeLevel; 
	
	public Student() {}
	
	// constructors 
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.phoneNumber = phoneNumber; 
		this.gradeLevel = gradeLevel; 
		
		// this keyword means self like who ever is using it, the user. 
		
	}
	// we want it to be able to do something, lets create a method.
	
	// Public methods 
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);

	}
	
	private boolean checkLength(String str, int length) {
		return str.length() > length; 
	}
	
	public void setFirstname(String firstName) {
		if (checkLength(firstName, 1)) {
		this.firstName = firstName; 
		}
	}
	
	public String getFirstname() {
		return firstName; 
		
		
	}
	
	public void setLastName(String lastName) {
		if (checkLength(lastName, 1)) {
		this.lastName = lastName; 	
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) 
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13)
		this.gradeLevel = gradeLevel; 
				
	}
	
	public int getGradelevel() {
		return gradeLevel;
	}
	
	
	
	
	
	
	
}
