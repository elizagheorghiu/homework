package quiz;

public class Square implements Shape {

	// te rog sa nu mai faci campuri/metode statice
	static int latura;

	public Square(int latura) {
		calculateSurface();
		calculatePerimeter();
	}

	public int getLatura() {
		return latura;
	}

	public void setLatura(int latura) {
		Square.latura = latura;
	}

	@Override

	public double calculateSurface() {
		double surface;
		surface = latura * 2;
		System.out.println(surface);
		return surface;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter;
		perimeter = latura * 4;
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
