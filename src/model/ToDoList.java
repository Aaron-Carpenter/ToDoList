package model;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    exitProgram();
                    return; // Exit the main method but not the program
            }
        }
    }

    private static void displayMenu() {
        System.out.println("To-Do List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Update Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        int choice;
        do {
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > 5) {
                System.out.println("Sorry, that is not an option!");
                System.out.print("Enter your choice (1-5): ");
            }
        } while (choice < 1 || choice > 5);

        return choice;
    }

    public static void addTask() {
        System.out.print("Enter a new task: ");
        String newTask = scanner.nextLine();
        tasks.add(newTask);
        System.out.println("Task added!");
    }

    private static void updateTask() {
        System.out.print("Enter the task number to update: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (isValidTaskNumber(taskNumber)) {
            System.out.print("Enter the updated task: ");
            String updatedTask = scanner.nextLine();
            tasks.set(taskNumber - 1, updatedTask);
            System.out.println("Task updated!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void listTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void deleteTask() {
        System.out.print("Enter the task number to delete: ");
        int deleteNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (isValidTaskNumber(deleteNumber)) {
            tasks.remove(deleteNumber - 1);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }

    private static void exitProgram() {
        System.out.println("Goodbye!");
        scanner.close();
        // Don't use System.exit(0); to prevent the program from terminating
    }
}