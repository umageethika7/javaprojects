package abc;

public class ConstantTimeExample {

	public static void printFirstElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("First Element is:"+arr[0]);
		}else {
			System.out.println("Array is empty.");
		}
		

	}
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,33,44,55,66,77,88,99,11,23,24,25,26,27,28,29,30,41,42,43,44,45,46,47,484,49,50};
		printFirstElement(numbers);
	}

}
