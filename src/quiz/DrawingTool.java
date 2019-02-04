package quiz;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {
	static List<Shape> shapeList = new ArrayList<>();

	public List<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(List<Shape> shapeList) {
		DrawingTool.shapeList = shapeList;
	}

	public static List<Circle> getCircleList() {
		return circleList;
	}

	public static void setCircleList(List<Circle> circleList) {
		DrawingTool.circleList = circleList;
	}

	public static List<Triangle> getTriangleList() {
		return triangleList;
	}

	public static void setTriangleList(List<Triangle> triangleList) {
		DrawingTool.triangleList = triangleList;
	}

	public static List<Rectangle> getRectangleList() {
		return rectangleList;
	}

	public static void setRectangleList(List<Rectangle> rectangleList) {
		DrawingTool.rectangleList = rectangleList;
	}

	public static List<Square> getSquareList() {
		return squareList;
	}

	public static void setSquareList(List<Square> squareList) {
		DrawingTool.squareList = squareList;
	}

	static List<Circle> circleList = new ArrayList<>();

	static public void addCircle(int r) {
		circleList.add(new Circle(r));
		shapeList.addAll(circleList);
		for (Circle circle : circleList) {
			if (Circle.getR() == circle.r) {
				System.out.println("Cannot add circle, there is already a similar shape");
			}

			System.out.println("You have added a new circle");
		}
	}

	static List<Triangle> triangleList = new ArrayList<>();

	@SuppressWarnings("static-access")
	public static void addTriangle(int height, int base) {

		for (Triangle triangle : triangleList) {
			if (Triangle.getHeight() == triangle.height && Triangle.getBase() == triangle.base) {
				System.out.println("Cannot add triangle, there is already a similar shape");
			}

		}
		System.out.println("You have added a new triangle");
		triangleList.add(new Triangle(height, base));
		shapeList.addAll(triangleList);
	}

	static List<Rectangle> rectangleList = new ArrayList<>();

	@SuppressWarnings("static-access")
	public static void addRectangle(int latime, int lungime) {

		for (Rectangle rectangle : rectangleList) {
			if (Rectangle.getLatime() == rectangle.latime && rectangle.lungime == Rectangle.getLungime()) {
				System.out.println("Cannot add rectangle, there is already a similar shape");
			}
			System.out.println("You have added a new rectangle");

		}

		rectangleList.add(new Rectangle(latime, lungime));
		shapeList.addAll(rectangleList);
	}

	static List<Square> squareList = new ArrayList<>();

	public static void addSquare(int latura) {
		for (Square square : squareList) {
			if (Square.latura == square.latura) {
				System.out.println("Cannot add square, there is already a similar shape");
			}
			System.out.println("You have added a new square");
		}

		squareList.add(new Square(latura));
		shapeList.addAll(squareList);
	}

}
