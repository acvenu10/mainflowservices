import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String description;
    private String dueDate;

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
}

public class TaskmanagementSystem {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();

                    Task newTask = new Task(taskName, taskDescription, dueDate);
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter task name to remove: ");
                    String removeName = scanner.nextLine();

                    for (Task task : tasks) {
                        if (task.getName().equals(removeName)) {
                            tasks.remove(task);
                            System.out.println("Task removed successfully!");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTask List:");
                    for (int i = 0; i < tasks.size(); i++) {
                        Task task = tasks.get(i);
                        System.out.println("Task " + (i + 1) + ":");
                        System.out.println("Name: " + task.getName());
                        System.out.println("Description: " + task.getDescription());
                        System.out.println("Due Date: " + task.getDueDate());
                    }
                    break;

                case 4:
                    System.out.println("Exiting Task Management System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
