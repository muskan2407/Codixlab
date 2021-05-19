package Day_4;

public class AbstractionTrain {
		// TODO Auto-generated method stub
		int fuel = 20;
		int maxFuelCapacity = 25;

		public static void main(String[] args) {
			AbstractionTrain train = new AbstractionTrain();
			train.fuelTrain();
			train.fuelTrain();
			train.fuelTrain();
			train.fuelTrain();
			train.fuelTrain();
			train.runTrain();
		}

		void fuelTrain() {
			if (maxFuelCapacity > fuel) {
				fuel += 1;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Fuel Capacity is reached: " + fuel);
			}
		}

		void runTrain() {
			for (int i = fuel; i > 0; i--) {
				if (i > 1) {
					fuel--;
					System.out.println("Fuel: " + fuel);
				} else {
					System.out.println("Please Fuel Up Train1: ");
					break;
				}
			}
		


			

		
	}

}
