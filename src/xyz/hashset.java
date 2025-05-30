package xyz;

import java.util.HashSet;
import java.util.Scanner;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> student = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter names of 5 students");
        for(int i=0;i<=5;i++)
        {
        	System.out.println("enter the names of students"+ i +"");
        	String name = sc.nextLine();
        	student.add(name);
        }
        System.out.println("student names are");
        for(String students:student)
        {
        	System.out.println(students);
        }
        
        

	}

}
