package QA;

public class ItCompany extends Company {
    private double Outsourcing;
    private double Outstaffing;
    private double RasxodTexnika;
    private double RasxodOffice;

    public ItCompany(String name, double budget, String director) {
        super(name, budget, director);
    }

    public ItCompany(String name, double budget, String director, double outsourcing, double outstaffing, double rasxodTexnika, double rasxodOffice) {
        super(name, budget, director);
        this.Outsourcing = Outsourcing;
        this.Outstaffing = Outstaffing;
        this.RasxodTexnika = RasxodTexnika;
        this.RasxodOffice = RasxodOffice;
    }

    public double getOutsourcing() {
        return Outsourcing;
    }

    public void setOutsourcing(double outsourcing) {
        this.Outsourcing = outsourcing;
    }

    public double getOutstaffing() {
        return Outstaffing;
    }

    public void setOutstaffing(double outstaffing) {
        this.Outstaffing = outstaffing;
    }

    public double getRasxodTexnika() {
        return RasxodTexnika;
    }

    public void setRasxodTexnika(double rasxodTexnika) {
        this.RasxodTexnika = rasxodTexnika;
    }

    public double getRasxodOffice() {
        return RasxodOffice;
    }

    public void setRasxodOffice(double rasxodOffice) {
        this.RasxodOffice = rasxodOffice;
    }
    public void companyInfo() {
        this.companyInfo(this);
        System.out.println("Доходы с аутсорсинга: "+this.Outsourcing +
                "\nДоходы с аутстаффинга: "+this.Outstaffing +
                "\nРасходы на технику:"+this.RasxodTexnika +
                "\nОфисные расходы: "+this.RasxodOffice);
    }
}
