package uma;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nSimple To-Do-List App");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete a task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter your task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task Added Successfully");
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No Task Found");
                } else {
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Nothing to Delete");
                } else {
                    System.out.print("Enter Task Number to Delete: ");
                    int tasknum = sc.nextInt();
                    sc.nextLine();
                    if (tasknum >= 1 && tasknum <= tasks.size()) {
                        tasks.remove(tasknum - 1);
                        System.out.println("Task Deleted");
                    } else {
                        System.out.println("Invalid Number");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!!");
                break;
            } else {
                System.out.println("Please choose a valid option (1-4)");
            }
        }

        sc.close();
    }
}
