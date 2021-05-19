package Day_4;

public class EncapsulationBus {
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
		EncapsulationBus bus = new EncapsulationBus();
		bus.color = "green";
		System.out.println("Car Current Speed: "+ bus.speed);
		bus.accelrateSpeed();
		bus.accelrateSpeed();
		bus.breakBus();
		bus.stopBus();
	}
	
	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void breakBus() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopBus() {
		speed = 0;
		System.out.println("Bus Stopped & speed is "+speed);
	}
}

