package QA;

import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company company) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Меню для работы с компанией: ");
        System.out.println("1) Вывод информацию о компании");
        System.out.println("2) Вывод списка сотрудников компании");
        System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
        System.out.println("4) Добавление сотрудника в компанию");
        System.out.println("5) Удаление сотрудника из компании");
        System.out.println("6) Поменять руководителя компании");
        System.out.println("7) Меню для работы с сотрудниками");
        System.out.println("0) Выход из главного меню");
        int command = scanner.nextInt();
        if (command == 1) {
            //Вывод информации об этой компании ( кроме списка сотруников )
            company.companyInfo(company);
        } else if (command == 2) {
            //Вывод списка сотрудников этой компании
            company.SpisokEmployees();
        } else if (command == 3) {
            //Подсчёт всех заработных плат сотрудников
            company.ZarplataSotrudnikov();
        } else if (command == 4) {
            //Добавление компании в холдинг
            System.out.println("Введите имя нового сотрудника: ");
            String name = scanner.next();
            System.out.println("Введите зарплату нового сотрудника: ");
            double salary = scanner.nextDouble();
            System.out.println("Введите должность нового сотрудника: ");
            String Doljnost = scanner.next();
            company.addEmployee(new Employee(name,salary,Doljnost));
        } else if (command == 5) {
            //Удаление компании из холдинга
            System.out.println("Введите имя компании ");
            String name = scanner.next();
            company.UdalenieEmployee(name);
        } else if (command == 6) {
            System.out.println("Введите имя сотрудника которого желаете сделать директором: ");
            String emName = scanner.next();
            Employee employee = company.getEmployeeByName(emName);
            System.out.println(employee);
            System.out.println("Желаете ли вы назначить данного работника на место директора? \n1: Конечно \n2: Мы вам перезвоним");
            int num = scanner.nextInt();
            if(num==1) {
                company.setDirector(employee.getName());
            }else {
                System.out.println("Мы вам перезвоним");
            }
            //Смена руководителя компании
        } else if (command == 7) {
            System.out.println("Введите имя сотрудника: ");
            String employeeName1 = scanner.nextLine();
            String employeeName = scanner.nextLine();
            //Поиск сотрудника по имени
            Employee foundedEmployee = company.getEmployeeByName(employeeName);
            EmployeeMenu.start(foundedEmployee);
        } else if (command == 0) {
            break;
        } else {
            System.out.println("Ошибка! Введите цифру из меню:");
        }
    }
}
}


