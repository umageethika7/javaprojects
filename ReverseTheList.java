package xyz;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.reverse(list);  

        System.out.println(list);   
}
}

