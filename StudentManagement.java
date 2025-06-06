package xyz;
import java.util.*;

class Student {
    String name;
    int age, grade;
    Student(String n, int a, int g) {
        name = n;
        age = a;
        grade = g;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade: ");
            int grade = sc.nextInt();
            list.add(new Student(name, age, grade));
        }

        System.out.println("\nStudents with grade above 80:");
        for (Student s : list) {
            if (s.grade > 80)
                System.out.println(s.name);
        }
        sc.close();
        
    }
}
