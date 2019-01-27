package tema_22_12.vehicles;

public abstract class Car implements Vehicle{
	

	public Car (int tireSize, String chassisNumber) {
	}
	int fuelTankSize;
	String fuelType;
	int gear;
	double consumptionPer100KM;
	double km;
	int n;
	
	float availableFuel; 
    int tireSize;
	
    float AverageFuelConsumption; 
	
	
	
	public boolean drive (double km) {
		int i = 0;
		double countKM=0;
		for (i = 0; i<=gear; i++) {
			n = 10+10;
			countKM=n+n;
			while (countKM<=km) {
				System.out.println("In gear" + i + "the car can be drive for " + n + " km");	
			} 
				System.out.println("You have reached max number of km for this car which is: "+ km);	
					
		}
		return false;
	}
		
		
	
	public double start( double km) {
		System.out.println("At the start of your car your available fuel is: " + availableFuel);			
	
		return availableFuel;
	}
	
	public double stop ( double km) {
		int i = 0;
		@SuppressWarnings("unused")
		double countKM=0;
		for (i = 0; i<=gear; i++) {
			n = 10+10;
			countKM=n+n;
			availableFuel= availableFuel-15;
			System.out.println("For driving your car: "+ km + "your available fuel is: " + availableFuel);			
	}
		return availableFuel;
	}
	
	public double consumptionPer100KM (double consumptionPer100KM) {
		int i = 0;
		for (i=0; i< gear; i++) {
		System.out.println("Cannot compute consumption per 100 km because you have not drove in your last gear");
			}
		System.out.println("Your consumption per 100 km is: " );
		return consumptionPer100KM ;
	}


	public int shiftGear(int g) {
		g=0;
		for(g=0; g<=gear; g++) {
		System.out.println	("You are driving your car in gear: " + g);
		 
	}
		return g;
	}

	public int getFuelTankSize() {
		return fuelTankSize;
	}



	public void setFuelTankSize(int fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
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



	public float getAverageFuelConsumption() {
		return AverageFuelConsumption;
	}



	public void setAverageFuelConsumption(float averageFuelConsumption) {
		AverageFuelConsumption = averageFuelConsumption;
	}
	
		

	}	

	


