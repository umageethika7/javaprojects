package xyz;
import java.util.HashMap;

public class HashMapGroceryBasket {

	public static void main(String[] args) {
		HashMap<String,Integer> gb = new HashMap<String,Integer>();
		gb.put("Milk",30);
		gb.put("sugar",50);
		gb.put("coffee",60);
		gb.put("salt",20);
		gb.put("rice",70);
		System.out.println(gb);
		int total=0;
		for(int cost:gb.values()) {
			total+=cost;
		}
		System.out.println(total);
				
		

	}

}
