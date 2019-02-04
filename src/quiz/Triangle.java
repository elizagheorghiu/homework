package quiz;

public class Triangle implements Shape {

	//te rog sa nu mai faci campuri/metode statice
	static int height;
	static int base;

	public Triangle(int height, int base) {
	}

	public static int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		Triangle.height = height;
	}

	public static int getBase() {
		return base;
	}

	public void setBase(int base) {
		Triangle.base = base;
	}

	public double calculateSurface() {
		double surface;
		surface = height * base;
		System.out.println(surface);
		return surface;
	}

	public double calculatePerimeter() {
		double perimeter;
		perimeter = height + base;
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
