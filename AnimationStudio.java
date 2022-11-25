package QA;

public class AnimationStudio extends Company {
    private double YouTubeDoxod;
    private double OfficeRasxod;
    private double TexnikaRasxod;
    private double ZarplataRasxod;
    private double ReklamaRasxod;



    public AnimationStudio(String name, double budget, String director) {
        super(name, budget, director);
    }

    public AnimationStudio(String name, double budget, String director, double YouTubeDoxod, double OfficeRasxod, double TexnikaRasxod, double ZarplataRasxod, double ReklamaRasxod) {
        super(name, budget, director);
        this.YouTubeDoxod = YouTubeDoxod;
        this.OfficeRasxod = OfficeRasxod;
        this.TexnikaRasxod = TexnikaRasxod;
        this.ZarplataRasxod = ZarplataRasxod;
        this.ReklamaRasxod = ReklamaRasxod;
    }

    public double getYouTubeDoxod() {
        return YouTubeDoxod;
    }

    public void setYouTubeDoxod(double youTubeDoxod) {
        this.YouTubeDoxod = youTubeDoxod;
    }

    public double getOfficeRasxod() {
        return OfficeRasxod;
    }

    public void setOfficeRasxod(double officeRasxod) {
        this.OfficeRasxod = officeRasxod;
    }

    public double getTexnikaRasxod() {
        return TexnikaRasxod;
    }

    public void setTexnikaRasxod(double texnikaRasxod) {
        this.TexnikaRasxod = texnikaRasxod;
    }

    public double getZarplataRasxod() {
        return ZarplataRasxod;
    }

    public void setZarplataRasxod(double zarplataRasxod) {
        this.ZarplataRasxod = zarplataRasxod;
    }

    public double getReklamaRasxod() {
        return ReklamaRasxod;
    }

    public void setReklamaRasxod(double reklamaRasxod) {
        this.ReklamaRasxod = reklamaRasxod;
    }
    public void companyInfo() {
        this.companyInfo(this);
        System.out.println("Доходы с YouTube: " + this.YouTubeDoxod +
                "\nОфисные расходы: "+this.OfficeRasxod +
                "\nРасходы на технику:"+this.TexnikaRasxod +
                "\nРасходы на зарплату: " + this.ZarplataRasxod +
                "\nРасходы на рекламу: "+ this.ReklamaRasxod);
    }
}

