package xyz;
import java.util.Scanner;
public class RunUmbrella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input as yes or no");
		String input= sc.nextLine();
		if (input.equals("yes")){
			System.out.println("Take an umbrella");
		}
		else {
			System.out.println("no need of an umbrella");
		}

		sc.close();
	}

