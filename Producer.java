package QA;

public class Producer extends Employee {
    private String[] SpisokProduktov = {"NeCAXAR","DreamWorks","Kyrgyzstan"};
    public Producer(String name, double zarplata) {
        this.setName(name);
        this.setZarplata(zarplata);
        this.setDoljnost("Producer");
    }

    public String[] getSpisokProduktov() {
        return SpisokProduktov;
    }

    public void setSpisokProduktov(String[] spisokProduktov) {
        this.SpisokProduktov = spisokProduktov;
    }

    public void SpisokInformaciiProdukta() {
        System.out.println("Список проектов:");
        for(int i = 0; i< SpisokProduktov.length; i++) {
            if(SpisokProduktov[i]!=null) {
                System.out.println((i+1)+") "+ SpisokProduktov[i]);
            }else {
                return;
            }
        }
    }
    public void producerInfo() {
        System.out.println(this);
        this.SpisokInformaciiProdukta();
    }
}
