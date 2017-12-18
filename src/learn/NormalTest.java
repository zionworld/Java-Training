package learn;

public class NormalTest {

	String title;
	String author;
	String name;
	
	public static void main(String[] args) {
		
		int x = 0;
		
		NormalTest[] mybooks = new NormalTest[3];
		mybooks[0] = new NormalTest();
		mybooks[1] = new NormalTest();
		mybooks[2] = new NormalTest();
		
		mybooks[0].title = "The Grapes of Java";
		mybooks[1].title = "The Java Gatsby";
		mybooks[2].title = "The Java cookbook";
		mybooks[0].author = "Bob";
		mybooks[1].author = "Sue";
		mybooks[2].author = "Ian";
		
		while (x < mybooks.length){
		System.out.println(mybooks[x].title + " by " + mybooks[x].author);
		x++;
		}
		
		
		NormalTest[] hobbitName = new NormalTest[4];
		hobbitName[0] = new NormalTest();
		hobbitName[1] = new NormalTest();
		hobbitName[2] = new NormalTest();
		hobbitName[3] = new NormalTest();
		int z = 0;
		
		while (z < hobbitName.length){
			
			hobbitName[z].name = "bilbo";			
			if(z == 1){
				hobbitName[z].name = "frodo";
			} else if(z == 2){
				hobbitName[z].name = "San";
			}	
			System.out.println(hobbitName[z].name);
			z++;			
		}
		
	}

}
