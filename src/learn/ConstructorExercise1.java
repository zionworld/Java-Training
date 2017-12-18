package learn;

public class ConstructorExercise1 {

	public static void main(String[] args) {
		
		
		
		/*
		ConstructorExercise const1 = new ConstructorExercise("Red","X1","BMW");
		const1.printCarDetails();
		System.out.println("-------------------------------------");
		ConstructorExercise const2 = new ConstructorExercise("Green","X2","BMW");
		const2.printCarDetails();
		System.out.println("-------------------------------------");
		ConstructorExercise const3 = new ConstructorExercise("Blue","X3","BMW");
		const3.printCarDetails();
		System.out.println("-------------------------------------");
		ConstructorExercise const4 = new ConstructorExercise("Yellow","IM253","BMW");
		const4.printCarDetails();
		System.out.println("-------------------------------------");
		ConstructorExercise const5 = new ConstructorExercise("White","POLO","VW");
		const5.printCarDetails();
		System.out.println("-------------------------------------");
		ConstructorExercise const6 = new ConstructorExercise("Black","Cayenne Series1","Porche");
		const6.printCarDetails();
		System.out.println("-------------------------------------");

		*/
		
		int x=5;
		int num = addoneTo(x);
		System.out.println(num);
	}
	
		static int addoneTo(int num){
			num = num+1;
			return num;
	}	
	
}
