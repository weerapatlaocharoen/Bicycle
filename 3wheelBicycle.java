class ThreeWheelBicycle extends Bicycle{
	int wheel = 3;
  void printStates(){
  	super.printStates();
  System.out.println("cadence=> " + cadence + " speed=> " + speed + " gear=> " + gear + " wheel=> " + wheel);

}
}