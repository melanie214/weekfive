package weekfive;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name1 = new StringBuilder();
		
		// StringBuilder = Class 
		// new StringBuilder(); = creates an instance of our StringBuilder Class and we assign it to our variable = name
		// So this creates an Object 
		
		// we can build multiple objects from the same blueprint or class 
		
		StringBuilder name2 = new StringBuilder();
		
		// how to create our own classes because a lot of the time there isn't already a premade class for how we want to
		// structure our data and methods. 
		// create new class named Student 
		
		Student student1= new Student();
		
		
		
		student1.firstName= "Tom";
		student1.lastName= "Smith"; 
		student1.gradeLevel= 12;
		student1.phoneNumber= "480-123-4567";
		
		student1.introduce();
		
		Student student2= new Student("Sammy",  "Jones");
		student2.introduce();
		
		Student student3= new Student("Tom", "Riddle", "666-666-6666" , 11);
		student3.introduce();
		
		
		
		

	}

}
