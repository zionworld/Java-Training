package dataStructure;

public class Matrix {

	public static void main(String[] args) {
		String[][] users = { 
				{"John","Williams","jw@test.com"},
				{"Sarah","Jackson","sj@test.com"},
				{"Kerry","Smith","ks@test.com"} 
				};
		
		System.out.println("Print matrix using old for loop");
		for(int i=0;i<users.length;i++){
			System.out.print(users[i][0]);
			System.out.print(" , "+users[i][1]);
			System.out.print(" , "+users[i][2]);
			System.out.println();
		}
		
		System.out.println("\n\n Print matrix using Enhanced for loop");
		for(String[] i : users){
			System.out.print("[");
			for(String j : i){
				System.out.print(j + " ");
			}
			System.out.println("]");
		}
		
		}

	}


