package QA;

import java.util.Scanner;

public class EmployeeMenu {
    public static void start(Employee employee) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("1) Вывод информации о сотруднике");
        System.out.println("0) Выход из главного меню");
        int command = scanner.nextInt();
        if (command == 1) {
            //Вывод информации о сотруднике
            System.out.println(employee);
        } else if (command == 0) {
            break;
        } else {
            System.out.println("Ошибка! Введите пункт из меню");
        }
    }
}
}


