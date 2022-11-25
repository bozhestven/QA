package QA;

public class Employee {
        public Employee(String name, double Zarplata, String Doljnost) {
            this.name = name;
            this.Zarplata = Zarplata;
            this.Doljnost = Doljnost;
        }
        private String name;
        private double Zarplata;
        private String Doljnost;

        public Employee() {
        }

        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public double getZarplata() {
            return Zarplata;
        }

        public void setZarplata(double zarplata) {
            this.Zarplata = zarplata;
        }

        public String getDoljnost() {
            return Doljnost;
        }

        public void setDoljnost(String doljnost) {
            this.Doljnost = doljnost;
        }

        @Override
        public String toString() {
            return "Работник: " +
                    "\nИмя: " + name +
                    "\nЗарплата: " + Zarplata +
                    "\nДолжность: " + Doljnost;
        }
    }



