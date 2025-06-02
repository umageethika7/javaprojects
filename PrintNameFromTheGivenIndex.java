package xyz;
import java.util.ArrayList;
public class PrintNameFromTheGivenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        int index = 1; 
        if (index >= 0 && index < names.size()) {
            System.out.println("Name at index " + index + ": " + names.get(index));
        } else {
            System.out.println("Invalid index.");
        }

	}

}
