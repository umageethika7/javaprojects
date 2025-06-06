package xyz;
import java.util.Queue;
import java.util.LinkedList;
public class QueueIceCreamShop {

	public static void main(String[] args) {
		Queue<String> qics = new LinkedList<String>();
		qics.add("child 1");
		qics.add("child 2");
		qics.add("child 3");
		qics.add("child 4");
		qics.add("child 5");
		System.out.println(qics);
		System.out.println("Showing which child is first");
		System.out.println(qics.peek());
		System.out.println("Removing the 1st child after serving");
		System.out.println(qics.poll());
		qics.add("child 6");
		System.out.println(qics);
		
		
		
		

	}

}
