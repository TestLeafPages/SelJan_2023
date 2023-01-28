package week3.day1;

public class BMW extends Car{
	
	public void autoPark() {
		System.out.println("Auto Park !!");
	}
	
	@Override
	public void applyBrake() {
		System.out.println("ABS Brake is applied");
	}

	
	public static void main(String[] args) {
		BMW myCar = new BMW();
		myCar.applyBrake();
		myCar.turnACOn();
		myCar.autoPark();
		myCar.soundHorn();
		
		Vehicle veh = new Vehicle();
		veh.applyBrake();
	}
}
