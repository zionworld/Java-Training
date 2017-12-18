package learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args) {
		System.out.println("CollectionsDemo.main()");
		mapDemo();
		 setDemo();
		
		 

		listDemo();
	}

	private static void mapDemo() {
		System.out.println("CollectionsDemo.mapDemo()");
		Map<String, People> map = new HashMap<String,People>();
		
		
		People p1 = new People();
		p1.name = "P1";
		p1.addr="11";
		map.put(p1.name, p1);

		People p2 = new People();
		p2.name = "P2";
		p2.addr="12";
		map.put(p2.name, p2);

		People p3 = new People();
		p3.name = "xyz";
		p3.addr="11";
		map.put(p3.name, p3);
		People people = map.get("xyz") ;
		System.out.println(people.addr);
	}

	private static void setDemo() {
		System.out.println("CollectionsDemo.setDemo()");
		Set<People> ppl = new HashSet<>();
		People p1 = new People();
		p1.name = "P1";

		ppl.add(p1);

		People p2 = new People();
		p2.name = "P2";
		ppl.add(p2);

		People p3 = new People();
		p3.name = "P1";
		ppl.add(p3);
		doSomething(ppl);
	}

	private static void listDemo() {
		System.out.println("CollectionsDemo.listDemo()");
		List<People> ppl = new LinkedList<People>();
		People p1 = new People();
		p1.name = "P1";

		ppl.add(p1);

		People p2 = new People();
		p2.name = "P2";
		ppl.add(p2);

		People p3 = new People();
		p3.name = "P3";
		ppl.add(p3);
		doSomething(ppl);
	}

	static void doSomething(Collection<People> ppl) {
		for (People people : ppl) {
			System.out.println(people.name);
		}
	}
}

class People {
	String name;
	String addr;
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof People) {
			People p = (People)obj;
			if (p.name == this.name) {
				return true;
			} else {
				return false;
			}
		}else{
			return false;
		}
	}

}