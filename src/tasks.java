import java.util.ArrayList;
import java.util.Scanner;

public class tasks {

    public static void addTask(ArrayList<String> tasksList, Scanner scanner) {
        System.out.println("Enter task: ");
        String name = scanner.nextLine();
        tasksList.add(name);
    }

    public static void showTask(ArrayList<String> tasksList) {
        System.out.println("Your tasks: ");
        for (int i = 0; i < tasksList.size(); i++) {
            System.out.println(tasksList.get(i));
        }
    }

    public static void removeTask(ArrayList<String> tasksList, Scanner scanner) {
        System.out.println("Enter x , what delete? ");
        int x = scanner.nextInt();
        tasksList.remove(x);
    }

    public static void deleteByName(ArrayList<String> tasksList, Scanner scanner) {
        System.out.print("Введите задачу для удаления: ");
        String name = scanner.nextLine().trim();

        if (tasksList.remove(name)) {
            System.out.println("Удалено!");
        } else {
            System.out.println("Такой задачи нет.");
        }
    }

}
