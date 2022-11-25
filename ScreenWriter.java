package QA;

public class ScreenWriter extends Employee {
    private String[] janr = {"Боевик","Комедия","Фантастика"};
    public ScreenWriter(String name, double zarplata) {
        this.setName(name);
        this.setZarplata(zarplata);
        this.setDoljnost("Screen Writer.");
    }

    public String[] getJanr() {
        return janr;
    }

    public void setJanr(String[] janr) {
        this.janr = janr;
    }
    public void writerInfo() {
        System.out.println(this);
        System.out.println("Список жанров кино: ");
        for(int i = 0; i< janr.length; i++) {
            System.out.println((i+1)+") "+ janr[i]+" ");
        }
    }
}
