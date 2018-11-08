package weekfive;

public class player {
	
	private String name; 
	private String position; 
	private String speciality; 
	
	public player(String name, String position, String speciality) {
		this.name = name; 
		this.position = position; 
		this.speciality = speciality; 
	}
	
	
	public void describe() {
		System.out.println("Player: " + name + "   Position: " + position + "   Speciality: " + speciality);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	

}
