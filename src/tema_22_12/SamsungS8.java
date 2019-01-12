package tema_22_12;

public class SamsungS8 extends Samsung{

	public SamsungS8(int imei) {
		super(imei);
		final int batteryLife = 9;
		
	}
	@Override
	public String color() {
		return "green";
	}
	@Override
	public String material() {
		return "concrete";
	}
}
