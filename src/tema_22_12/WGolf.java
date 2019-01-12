package tema_22_12;


public class WGolf extends WW {
	final double fuelTankSize =25;
	final double consumptionPer100Km = 13;
	final String fuelType = "Diesel 1";
	float availableFuel;
	
	final int[] gear = new int[5];
		public WGolf (int tireSize, int chassisNumber) {
			super(tireSize, chassisNumber);
			}
	
	Car car = new WGolf (15, 24243 );
	
	@Override
	public void shiftGear (int i) {
		for (i=1; i<=6; i++) {
			int doubleKm = 0;
			switch (i) {
			case 1:
				doubleKm = 14;
				break;
			case 2:
				doubleKm = 42;
				break;	
			case 3:
				doubleKm = 37;
				break;	
			case 4:
				doubleKm = 58;
				break;
			case 5:
				doubleKm = 61;
				break;
			case 6:
				doubleKm = 70;
				break;	
			}
			System.out.println("in gear" + i + "the car can be driven for "+ doubleKm+"km");
			
		}
		
		}

public void maxKmperGears (double km) {
			}

@Override
public boolean start() {
return false;
}

@Override
public boolean drive(double km) {
return false;
}

@Override
public boolean stop() {
return false;
}


double getAverageFuelConsumption() {
	if (start() ==true) {
		return (fuelConsumption=0);
			}
	return availableFuel;}

public double getAvailableFuel() {
if (stop()==true && start()==true) { return availableFuel  ;
}
return availableFuel;
}
public double getFuelTankSize() {
return fuelTankSize;
}


	}






