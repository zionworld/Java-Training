package javalearn;

public class class2 {
	
public static void main(String[] args){
	
	myfirstmethod();
	mystringarray();
	parpass("Sreejith");
	add(5,6);
	int sum = addsum(5,7,9);
	int multiply = sum * 5;
	System.out.println(multiply);
		
	Student mark = new Student();
	mark.setId(1);
	mark.setName("Sreejith");
	mark.setAge(15);
	System.out.println(mark.getName() +" is " +mark.getAge() +" old and id is "+mark.getId());
	
	Student tom = new Student();
	tom.setId(2);
	tom.setName("jithu");
	tom.setAge(16);
	System.out.println(tom.getName() +" is " +tom.getAge() +" old and id is "+tom.getId());
	
}

public static int addsum(int a, int b, int c){
	
	System.out.println(a + b + c);
	return (a + b + c);
	
}

public static void add(int a, int b){
	System.out.println(a+b);
}
public static void parpass(String name){
	System.out.println("Hello " + name);
}

public static void mystringarray(){
	
	String[] arrayname = {"Sreejith", "Sandeep", "Anish"};
	System.out.println(arrayname[0]);
}

public static void myfirstmethod(){
	
	int[] myarray = {100,31,48,76,25};
	int indx=0;
	
	while(indx < 5){
		System.out.println(myarray[indx]);
		indx++;	
		
	}
}
}
