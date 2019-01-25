package tema_22_12;

public class CClasse extends Mercedes {

	public CClasse(int tireSize, String chassisNumber) {
		super(tireSize, chassisNumber);
		// TODO Auto-generated constructor stub
	}
	

	final int fuelTankSize = 37;
	String fuelType = "Diesel 3";
	int gear = 5;
	double consumptionPer100KM = 9.8;
	double km = 500000;
	int n;
	
	float availableFuel = 21; 
	int tireSize = 9;
	
	String chassisNumber;
	
	@Override
	public boolean drive(double km) {
		int i = 0;
		double countKM=0;
		for (i = 0; i<=gear; i++) {
			n = 10+10;
			countKM=n+n;
			while (countKM<=km) {
				System.out.println("In gear" + i + "AClasse can be drive for " + n + " km");	
			} 
				System.out.println("You have reached max number of km for this car which is: "+ km);	
					
		}
		return false;
	}

	@Override
	public double start(double km) {
		// TODO Auto-generated method stub
		return availableFuel;
	}

	@Override
	public double stop(double km) {
		// TODO Auto-generated method stub
		return availableFuel;
	}

	@Override
	public double consumptionPer100KM (double consumptionPer100KM) {
		int i = 0;
		for (i=0; i< gear; i++) {
		System.out.println("Cannot compute consumption per 100 km for your Mercedes AClasse because you have not drove in your last gear");
			}
		System.out.println("your Mercedes AClasse's consumption per 100 km is: " );
		return consumptionPer100KM ;
	}
	

	
	public int shiftGear(int g) {
		g=0;
		for(g=0; g<=gear; g++) {
		System.out.println	("You are driving your Mercedes CCLasse in gear: " + g);
		 
	}
		return g;
	}
	

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}

	public double getConsumptionPer100KM() {
		return consumptionPer100KM;
	}

	public void setConsumptionPer100KM(double consumptionPer100KM) {
		this.consumptionPer100KM = consumptionPer100KM;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public float getAvailableFuel() {
		return availableFuel;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}

	public int getTireSize() {
		return tireSize;
	}

	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}

	public int getFuelTankSize() {
		return fuelTankSize;
	}

	
	
}


