package CarProgram;
		
public class carBmw extends Vehicle{
		
	public carBmw(int cyclinders, String carName) {
		super(cyclinders, carName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		
		Vehicle myBmw = new carBmw(4, "X3");
		myBmw.startEngine();
		myBmw.setColor("Red");		
		myBmw.setEngine(true);
		myBmw.setWheels(5);		
		myBmw.accelerate();
		
		
	}
	
		@Override
		public void startEngine(){			
			System.out.println("BMW has started the engine");
		}
		
		@Override
		public void accelerate(){
			System.out.println("BMW X3 is moving");
			System.out.println("Whhhoooooomm.......... Whoooooommmmmmmmmm");
		}
		
	
}
		
	

