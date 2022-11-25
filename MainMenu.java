package QA;

import java.util.Scanner;

public class MainMenu {
    public static void main(Holding holding) {
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Главне меню для работы с холдингом: ");
        System.out.println("1) Вывод списка компаний в холдинге");
        System.out.println("2) Вывод общего бюджета холдинга");
        System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
        System.out.println("4) Добавление компании в холдинг");
        System.out.println("5) Удаление компании из холдинга");
        System.out.println("6) Меню для работы с компанией");
        System.out.println("0) Выход из главного меню");
        int command = scanner.nextInt();
        if (command == 1) {
            holding.companiesInfo();
        } else if (command == 2) {
            //Подсчёт бюджета всех компаний в холдинге
            holding.sumOfBudget();
        } else if (command == 3) {
                holding.company();
            //Подсчёт всех работающих сотрудников и общее количество рабочих мест во всех компаниях
        } else if (command == 4) {
            System.out.println("Введите название компании: ");
            String name = scanner.next();
            System.out.println("Введите бюджет компании: ");
            Double budget = scanner.nextDouble();
            System.out.println("Введите имя директора: ");
            String director = scanner.next();
            Company company = new Company(name,budget,director);
            holding.addCompany(company);
            //Добавление компании в ходинг
        } else if (command == 5) {
            System.out.println("Введите название компании которую хотите удалить: ");
            String name = scanner.next();
            holding.removeCompany(name);
            //Удаление компании из холдинга
        } else if (command == 6) {
            System.out.println("Введите название компании: ");
            String companyName = scanner.next();
            //Поиск компании по имени
            Company foundedCompany = holding.getCompanyByName(companyName);
            CompanyMenu.start(foundedCompany);
        } else if (command == 0) {
            break;
        } else {
            System.out.println("Ошибка! Введите пункт из меню");
        }
    }
}
}
