package learn;

public class Sequence_Generator {

	public static void main(String[] args) {
		
		
		
		int[] fullNum = new int[50];
		int[] seqNum = new int[7];
		for(int i=0;i<=49;i++){
			fullNum[i] = i;
			for(i=0;i<=7;i++){
				seqNum[i]=(int) Math.random();
				System.out.print(seqNum[i]);
			}			
			System.out.print(fullNum[i]);			
			}			
		
	}

}
