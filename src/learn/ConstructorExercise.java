package learn;

public class ConstructorExercise {

	String color = "Black";
	String name = "";
	String brand = "";
	
	public ConstructorExercise(String carColor, String carName, String carBrand){
		
		this.color = carColor;
		this.name = carName;
		this.brand = carBrand;
		
		
	}
	
	public void printCarDetails(){
		System.out.println("Colour : "+ color + " Name : "+name+ " Brand : "+brand );
	}
}
