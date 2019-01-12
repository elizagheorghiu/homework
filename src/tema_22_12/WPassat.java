package tema_22_12;


public class WPassat extends WW{

	final double fuelTankSize =95;
	final double consumptionPer100Km = 15;
	final String fuelType = "Diesel 5";
	float availableFuel;
	
	final int[] gear = new int[4];	

	public WPassat(int tireSize, int chassisNumber) {
		super(tireSize, chassisNumber);
	}

	Car car = new WPassat (17, 4343 );
	
	@Override
	public void shiftGear (int i) {
		for (i=1; i<=4; i++) {
			int doubleKm = 0;
			switch (i) {
			case 1:
				doubleKm = 12;
				break;
			case 2:
				doubleKm = 22;
				break;	
			case 3:
				doubleKm = 72;
				break;	
			case 4:
				doubleKm = 82;
			
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



