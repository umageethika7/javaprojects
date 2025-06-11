package abc;
public class ReverseWorsInString{
    public static void main(String[] args) {
        String str = "chinthakunta uma geethika";
        String[] words = str.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
