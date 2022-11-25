package QA;

import java.util.Arrays;

public class Tester extends Employee{
    private String[] type = {"Ручной тест продукта","Автоматический"};
    private String itLanguage;

    public Tester(String name, double zarplata, String itLanguage) {
        this.setName(name);
        this.setZarplata(zarplata);
        this.itLanguage = itLanguage;
        this.setDoljnost("Tester");
    }
    public void testerInfo() {
        System.out.println(this);
        System.out.println("Тип тестировки: "+ Arrays.toString(type));
        System.out.println("Язык программирования: "+this.itLanguage);
    }
}
