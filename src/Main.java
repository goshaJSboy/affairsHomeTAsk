import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<String> tasksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.showMenu();
            int firstInput = scanner.nextInt();
            scanner.nextLine();
            if (firstInput == 0) {
                break;
            }
            if (firstInput == 1) {
                tasks.addTask(tasksList, scanner);
            }
            if (firstInput == 2) {
                tasks.showTask(tasksList);
            }
            if (firstInput == 3) {
                tasks.removeTask(tasksList, scanner);
            }
            if (firstInput == 4) {
                tasks.deleteByName(tasksList, scanner);
            }

        }
    }
}
