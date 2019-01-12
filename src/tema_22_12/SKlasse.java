package tema_22_12;


public class SKlasse extends Mercedes {

	final double fuelTankSize =24;
	final double consumptionPer100Km = 14;
	final String fuelType = "Diesel 3";
	float availableFuel;
	
	final int[] gear = new int[6];

	public SKlasse (int tireSize, int chassisNumber) {
		super(tireSize, chassisNumber);
		}
	
   
	Car car = new SKlasse (17, 4543543 );
	

	@Override
	public boolean start() {
		return false;
	}

	@Override
	public boolean stop() {
		return false;
	}
	
	public boolean drive(double km) {
		return false;
	}
	
	@Override
	public void shiftGear (int i) {
		for (i=1; i<=6; i++) {
			int doubleKm = 0;
			switch (i) {
			case 1:
				doubleKm = 12;
				break;
			case 2:
				doubleKm = 22;
				break;	
			case 3:
				doubleKm = 32;
				break;	
			case 4:
				doubleKm = 76;
				break;
			case 5:
				doubleKm = 98;
				break;
			case 6:
				doubleKm = 100;
				break;	
			}
			System.out.println("in gear" + i + "the car can be driven for "+ doubleKm+"km");
			
		}
		
		}

	double getAverageFuelConsumption() {
		if (start() ==true) {
			return (fuelConsumption=0);
				}
		return availableFuel;}
	}
				
		
	
	

















