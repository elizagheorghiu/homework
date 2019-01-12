package tema_22_12;


public abstract class Dacia extends Car {

	public Dacia(int tireSize, int chassisNumber) {
		super(tireSize, chassisNumber);
	}
 
	@Override
	public void shiftGear (int i) {
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
