package QA;

public class Razrabotchik extends Employee {


    private String[] technologyStack = {"Frontend","JavaBackend","C# Backend","Python"};


    public Razrabotchik(String name, double zarplata) {
        this.setName(name);
        this.setZarplata(zarplata);
        this.setDoljnost("Developer");
    }

    public String[] getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(String[] technologyStack) {
        this.technologyStack = technologyStack;
    }
    public void razrabotchikInfo() {
        System.out.println(this);
        System.out.println("Список технологий разработчика: ");
        for(int i=0;i<technologyStack.length;i++) {
            System.out.println((i+1)+") "+technologyStack[i]+" ");
        }
    }
}
