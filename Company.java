package QA;

public class Company {
        private String name;
        protected Employee[] employees = new Employee[5];
        private double budget;
        private String director;


        public Company() {
        }
        public Company(String name) {
            this.name = name;
        }


        public Company(String name, Employee[] employees) {
            this.name = name;
            this.employees = employees;
        }

        public Company(String name, Employee[] employees, double budget, String director) {
            this.name = name;
            this.employees = employees;
            this.budget = budget;
            this.director = director;
        }

        public Company(String name, double budget, String director) {
            this.name = name;
            this.budget = budget;
            this.director = director;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee[] getEmployees() {
            return employees;
        }

        public void setEmployees(Employee[] employees) {
            this.employees = employees;
        }

        public double getBudget() {
            return budget;
        }

        public void setBudget(double budget) {
            this.budget = budget;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }
        public boolean addEmployee(Employee employee) {

            for(int i=0;i<employees.length;i++) {
                if(employees[i]==null) {
                    employees[i] = employee;
                    System.out.println("Вы добавили нового сотрудника!");
                    return true;
                }
            } return false;
        }
        public Employee getEmployeeByName(String name) {
            for (int i = 0; i < this.employees.length; i++) {
                if (this.employees[i]!=null && this.employees[i].getName().equals(name)) {
                    return employees[i];
                }
            }
            System.out.println("Данного сотрудника нету в списке!");
            return null;
        }
        public boolean UdalenieEmployee(String name) {
            for(int i=0;i<this.employees.length;i++) {
                if(this.employees[i].getName().equals(name)&&this.employees[i]!=null) {
                    this.employees[i] = null;
                    System.out.println("Вы удалили сотрудника из списка!");
                    return true;
                }
            }
            System.out.println("Данного сотрудника нету.");
            return false;
        }


        public void companyInfo(Company company) {
            System.out.println("Название компании: "+company.getName()+
                    " \nРуководитель компании: "+company.getDirector()+
                    " \nБюджет компании: "+company.getBudget());
            System.out.println();
        }
        public void SpisokEmployees() {
            for (Employee em : employees) {
                if (em != null) {
                    System.out.println(em);
                    System.out.println("-----------------------------");
                }
            }
        }
        public void ZarplataSotrudnikov() {
            double sum = 0;
            for (int i = 0; i < this.employees.length; i++) {
                if (this.employees[i] != null) {
                    sum += this.employees[i].getZarplata();
                }
            }
            System.out.println("Общие расходы на зарплаты сотрудников составляют: "+sum+ " USD");
            System.out.println();
            System.out.println();
        }
        public void numberOfWorkPlaces() {
            int count1 = 0;
            int count2 = 0;
            for(int i=0; i<this.employees.length;i++) {
                if(this.employees[i]!=null) {
                    count1++;
                }else {
                    count2++;
                }
            }
            System.out.println("Компания: " + this.getName());
            System.out.println("Количество рабочих: " + count1);
            System.out.println("Количество вакантных мест: " + count2);
            System.out.println();
            System.out.println();
        }
    }


