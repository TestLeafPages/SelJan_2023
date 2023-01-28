package week3.day1;

public class BiCycle {

	/*
	 * If the method signature is same but 
	 * with different argument count 
	 * with different argument type
	 * with order of arguments 
	 * within the same class
	 * 
	 * Benefit: to improve verbose
	 */

	public String getCycleColor() {
		return "Black";
	}

	public String getCycleColor(String whose) {
		if (whose.equals("son")) {
			return "Red";
		} else if (whose.equals("daughter")) {
			return "pink";
		} else {
			return "black";
		}
	}

	public void getCycleColor(int cycleNumber) {

	}

	public void getCycleColor(int cycleNumber, String whose) {

	}
	
	public void getCycleColor(String who, int number) {

	}
	
	public static void main(String[] args) {
		BiCycle cycle = new BiCycle();
		cycle.getCycleColor("son");
		cycle.getCycleColor();
	}
}
