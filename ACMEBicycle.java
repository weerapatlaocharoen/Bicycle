class ACMEBicycle implements Bicycle{

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	public void changecCadence(int newValue){
		cadence = newValue;
	}

	public void changeGear(int newValue){
		gear = newValue;
	}

	public void speedUp(int increment){
		speed = speed + increment;
	}

	public void applyBreak(int decrement){
		speed = speed - decrement;
	}

	public void printStates(){
		System.out.println("cadence: " + cadence + "speed: " + speed + "gear" +gear);
	}
}