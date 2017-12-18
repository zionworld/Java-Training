package CarProgram;

public class bikeHarley extends Vehicle{

	public bikeHarley(int cyclinders, String VehicleName) {
		super(cyclinders, VehicleName);		
	}

	public static void main(String[] args) {
		
		Vehicle myHarley = new bikeHarley(4, "X3");
		myHarley.startEngine();
		myHarley.setColor("Black");		
		myHarley.setEngine(true);
		myHarley.setWheels(2);		
		myHarley.accelerate();	
		
	}
	
		@Override
		public void startEngine(){			
			System.out.println("Harley has started the engine");
		}
		
		@Override
		public void accelerate(){
			System.out.println("Harley Iron has started accelerating");
			System.out.println("GGRRrrrrr.......dup dup..Grrrr........");
		}
	}


