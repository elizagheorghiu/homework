package tema_22_12;

public class CarTestDrive {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Car car = new Car(); // This should not compile.

		//Car car = new Dacia(27, "oiqe0934hkkadsn"); // This should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

		Car car = new Logan(27, "oiqe0934hkkadsn"); // Logan can extend from Dacia, while Dacia extends from Car

		car.start(0);

		car.shiftGear(1);

		car.drive(0.01);// drives 0.01 KMs

		car.shiftGear(2);

		car.drive(0.02);

		car.shiftGear(3);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(5);

		car.drive(10);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(3);

		car.drive(0.1);

		car.stop(89);

		float availableFuel = car.getAvailableFuel();

		float fuleConsumedPer100Km = car.getAverageFuelConsumption();



		Vehicle vehicle = new WwGolf(30, "1987ddkshik289"); //available fuel and chassis number

		vehicle.start(20);

		vehicle.drive(1);

		vehicle.stop(90);

		Car car1 = (Car) vehicle;

	    availableFuel = car.getAvailableFuel();

		fuleConsumedPer100Km = car.getAverageFuelConsumption();

		
}
}
