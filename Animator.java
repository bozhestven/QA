package QA;

public class Animator extends Employee {
    private String[] skills = {"Умение рисовать фон, рисовать лицо и так далее"};

    public Animator(String name, double Zarplata) {
        this.setName(name);
        this.setZarplata(Zarplata);
        this.setDoljnost("Аниматор");
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public void animatorInfo() {
        System.out.println(this);
        System.out.println("Список умений:");
        for(int i=0;i<skills.length;i++){
            System.out.println((i+1)+") "+skills[i]+" ");
        }
    }
}
