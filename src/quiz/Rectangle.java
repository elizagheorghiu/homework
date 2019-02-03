package quiz;

public class Rectangle implements Shape {

	static int latime;
	static int lungime;
	
	public Rectangle(int latime, int lungime) {
		calculateSurface();
		calculatePerimeter();
	}
	
	public static int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		Rectangle.latime = latime;
	}

	public static int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		Rectangle.lungime = lungime;
	}

	@Override
	   public double calculateSurface() {
		double surface;
		surface = latime*lungime;
		System.out.println(surface);
		return surface;
				
	}

	@Override
	public double calculatePerimeter() {
		double perimeter; 
		perimeter = (latime*2)+(lungime*2);
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




