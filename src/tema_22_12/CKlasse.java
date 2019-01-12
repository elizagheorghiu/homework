package tema_22_12;


public class CKlasse extends Mercedes {

	
	final double fuelTankSize =23;
	final double consumptionPer100Km = 12;
	final String fuelType = "Diesel 4";
	float availableFuel ; 
	
	final int[] gear = new int[6];
	
	public CKlasse (int tireSize, int chassisNumber) {
		super(tireSize, chassisNumber);		
	}
	
	Car car = new CKlasse (32, 32434543);
	
	
	
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
				doubleKm = 42;
				break;
			case 5:
				doubleKm = 52;
				break;
			case 6:
				doubleKm = 62;
				break;	
			}
			System.out.println("in gear" + i + "the car can be driven for "+ doubleKm+"km");
			
		}
		
		}
				
		
	}

	






