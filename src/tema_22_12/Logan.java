package tema_22_12;


public class Logan extends Dacia {

	public Logan(int tireSize, int chassisNumber) {
		super(tireSize, chassisNumber);
	}
				
		final double fuelTankSize = 40;
		final double consumptionPer100Km = 17; 
		final String fuelType = "Petrol";
		float availableFuel;
						
		final int[] gear = new int[3];
		
	public void Car (int tireSize, int chassisNumber) {
				
	}
	@Override
	public void shiftGear (int i) {
		for (i=1; i<=3; i++) {
			int doubleKm = 0;
			switch (i) {
			case 1:
				doubleKm = 7;
				break;
			case 2:
				doubleKm = 12;
				break;	
			case 3:
				doubleKm = 100;
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
