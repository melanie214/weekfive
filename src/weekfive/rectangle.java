package weekfive;

public class rectangle {
	
	private double width;
	private double length; 
	private double area; 
	
	public rectangle (double width, double length) {
		this.width = width; 
		this.length = length; 
		this.area = width * length;
		}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		area = width * length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		area = width * length;
	}

	public double getArea() {
		return area;
	}

	
}


