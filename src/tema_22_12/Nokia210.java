package tema_22_12;

public class Nokia210 extends Nokia{

	public Nokia210(int imei) {
		super(imei);
		final int batteryLife = 17;
		
	}

	@Override
	public String material() {
		return "wood";
	}

	@Override
	public String color() {
		return "violet";
	}

}
