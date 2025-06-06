package xyz;
import java.util.Scanner;
public class BubbleSortHat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter the names");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        for (String name : names) {
            System.out.println(name);

	}
        sc.close();

}
}