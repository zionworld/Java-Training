package CarProgram;

class Vehicle {
	
	private boolean engine;	
	private int wheels;	
	private String color;
	private int cylinders;
	private String VehicleName;
	
	

	public Vehicle(int cyclinders,  String VehicleName) {
		
		this.engine = true;		
		this.wheels = 4;
		this.color = "";
		
	}
	
	
	public void startEngine(){
		System.out.println("Engine has started");
		
	}

	public void accelerate(){
		for(int i=1; i<6; i++){
			if(i==1){
				System.out.println("First Gear: Vehicle Moving");
			} else if(i==2){
				System.out.println("Second Gear : Vehicle taking speed");
			} else if(i==3){
				System.out.println("Third Gear : Vehicle on third gear");
			} else if(i==4){
				System.out.println("Forth Gear : !!!!!!!!!!!!!!!!!");
			} else {
				System.out.println("Fifth Gear : Brake Required");
				System.out.println("Brakeeeeeeee!!!!!!!!!!!!!!!!!!!!!!");
			}
		}	
	}

	public boolean isEngine() {
		return engine;
	}


	public void setEngine(boolean engine) {
		this.engine = engine;
	}	

	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		
	}


	public int getCylinders() {
		return cylinders;
	}


	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}


	public String getVehicleName() {
		return VehicleName;
	}


	public void setVehicleName(String VehicleName) {
		this.VehicleName = VehicleName;
	}
	
	}
