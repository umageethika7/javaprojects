package xyz;
import java.util.ArrayList;

public class RemovingElementByIndexAndByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.remove(1);               
        list.remove("Cherry");        

        System.out.println(list);

	}

}
