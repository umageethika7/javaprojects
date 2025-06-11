package abc;
public class BubbleSortonString {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date", "fig"};

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Strings:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
