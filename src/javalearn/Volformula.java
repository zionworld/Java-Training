package javalearn;

public class Volformula {
	
	int radius;

	public int rectangle(int length, int breadth, int height){
		return (length * breadth * height);
		
	
	}
	
	public int square(int length){
		return (length * length);
		
	}
	
	public int circle(){
		return (radius * radius);
	}
	
	Volformula(){
		radius = 10;
		
	}

	}
