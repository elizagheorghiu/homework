package tema_22_12.vehicles;

public abstract class WW extends Dacia {

	public WW(int tireSize, String chassisNumber) {
		super(tireSize, chassisNumber);
	}

	public boolean drive(double km) {
		int i = 0;
		double countKM = 0;
		for (i = 0; i <= gear; i++) {
			n = 10 + 10;
			countKM = n + n;
			while (countKM <= km) {
				System.out.println("In gear" + i + "your WW can be drive for " + n + " km");
			}
			System.out.println("You have reached max number of km for your WW which is: " + km);

		}
		return false;
	}

	public double start(double km) {
		System.out.println("At the start of your WW your available fuel is: " + availableFuel);

		return availableFuel;
	}

	public double stop(double km) {
		int i = 0;
		@SuppressWarnings("unused")
		double countKM = 0;
		for (i = 0; i <= gear; i++) {
			n = 10 + 10;
			countKM = n + n;
			availableFuel = availableFuel - 15;
			System.out.println("For driving your WW: " + km + "your available fuel is: " + availableFuel);
		}
		return availableFuel;
	}

	public double consumptionPer100KM(double consumptionPer100KM) {
		int i = 0;
		for (i = 0; i < gear; i++) {
			System.out.println(
					"Cannot compute consumption per 100 km for your WW because you have not drove in your last gear");
		}
		System.out.println("your WW's consumption per 100 km is: ");
		return consumptionPer100KM;
	}

}
