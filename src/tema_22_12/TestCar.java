package tema_22_12;


public class TestCar {

	
	
	public static void main(String[] args) {
		
		Car car = new WPassat (17, 32443);
				
		car.start();

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

		car.stop();

		double availableFuel = car.getAvailableFuel();

		double fuelConsumedPer100Km = car.getAverageFuelConsumption();
	}

	double getAverageFuelConsumption() {
		return 0;
	}

	 double getAvailableFuel() {
		return 0;
	}

	
	
}
