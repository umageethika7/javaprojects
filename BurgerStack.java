package uma;
import java.util.Stack;
public class BurgerStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> burgerStack = new Stack<String>();
		burgerStack.push("burger 1");
		burgerStack.push("burger 2");
		burgerStack.push("burger 3");
		System.out.println(burgerStack);
		System.out.println("Top burger is "+burgerStack.peek());
		System.out.println("Serving "+burgerStack.pop());
		if(burgerStack.isEmpty()) {
			System.out.println("All burgers are served");
		}
		

	}

}
