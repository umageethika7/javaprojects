package uma;
import java.util.Scanner;
public class palindromeExampleInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;       
            reversed = reversed * 10 + digit; 
            num = num / 10;             
        }

        if (originalNum == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
	}

}
