package abc;
import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {12, 34, 54, 2, 3, 76, 45};
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(array, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
