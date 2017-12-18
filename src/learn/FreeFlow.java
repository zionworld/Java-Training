package learn;

public class FreeFlow {

	public static void main(String[] args) {
		
		int alphabet = 'a';
		System.out.println("The ASCII value of the alphabet is "+alphabet);
		
		
		System.out.println("The Area is " +CalcArea(2,3));
		
		
		GraphicObjects Obj = new Graphic_Circle();
		Obj.height=9;
		Obj.length=9;
		System.out.println(Obj.sum());
		
		System.out.println(Obj.Area(10, 9));
		
		
	}
	
	static int CalcArea(int height, int width){
		return height * width;
	}

}
