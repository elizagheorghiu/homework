package quiz;

public class Circle implements Shape{
static int r;
 
public Circle (int r) {
	calculateSurface();
	calculatePerimeter();
}
		public static int getR() {
		return r;
	}
		
	


	public void setR(int r) {
		Circle.r = r;
	}


	 public double calculateSurface() {
		double surface;
		surface = r*2*3.14; 
		System.out.println(surface);
		return surface;
				
	}

	public double calculatePerimeter() {
		double perimeter; 
		perimeter = r;
		System.out.println(perimeter);
		return perimeter;
		}
	
	double perimeter = calculatePerimeter();
	
	public double getPerimeter() {
		return perimeter;
	}
	
	
	public double getSurface() {
		return surface;
	}
	
	double surface = calculateSurface();
	
	

}
