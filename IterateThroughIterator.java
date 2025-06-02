package xyz;

import java.util.ArrayList;
import java.util.Iterator;
public class IterateThroughIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> u = new ArrayList<String>();
		u.add("bablu");
		u.add("uma");
		u.add("geethu");
		u.add("anamcara");
		u.add("anu");
		u.add("janu");
		Iterator<String> it = u.iterator();
		System.out.println("Iterating using Iterator");
		while (it.hasNext()) {
            String a = it.next();
            System.out.println(a);
		
		}
	}

}
