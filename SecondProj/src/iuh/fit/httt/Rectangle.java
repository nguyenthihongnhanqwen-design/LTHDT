package iuh.fit.httt;

public class Rectangle {
	private double length;
	private double width;
	public static double getArea(double length, double width ) {
        return width * length;
    }
	public double getPerimeten(double length, double width) {
		return (width + length)/2;
	}
	// get
	public double getlegth() {
		return length;
	}
	public double getwidth() {
		return width;
	}
	//constructor
	public Rectangle() {
		
	}
	public Rectangle(double length, double width) {
		if(length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}
	// set
	public void setlength(double length) {
		
		if(length < 0) {
			throw new IllegalArgumentException("Legth must be greater than 0");
		}
		this.length = length;
	}
	public void setwidth(double width) {
			
			if(width < 0) {
				throw new IllegalArgumentException("Width must be greater than 0");
			}
			this.width = width ;
		}
}

