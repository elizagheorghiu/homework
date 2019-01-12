package tema_22_12;

public class Nokia3100 extends Nokia {

	public Nokia3100(int imei) {
		super(imei);
		final int batteryLife = 20;
		
	}

	@Override
	public String material() {
		return "hard plastic";
	}

	@Override
	public String color() {
		return "yellow";
	}
}
