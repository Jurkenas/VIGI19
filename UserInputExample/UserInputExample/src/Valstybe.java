public class Valstybe {
    private static final int DEFAULT_SOSTINIU_KIEKIS = 1;

    private String pavadinimas;
    private int gyventojuKiekis;
    private double plotas;
    private int sostiniuKiekis;
    private String zemynas;

    public Valstybe(String pavadinimas, int gyventojuKiekis, double plotas, int sostiniuKiekis, String zemynas) {
        this.pavadinimas = pavadinimas;
        this.gyventojuKiekis = gyventojuKiekis;
        this.plotas = plotas;
        this.sostiniuKiekis = sostiniuKiekis;
        this.zemynas = zemynas;
    }

    public Valstybe() {
        this.sostiniuKiekis = DEFAULT_SOSTINIU_KIEKIS;
    }

    public double getPlotasGyventojui() {
        return plotas / gyventojuKiekis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getGyventojuKiekis() {
        return gyventojuKiekis;
    }

    public void setGyventojuKiekis(int gyventojuKiekis) {
        this.gyventojuKiekis = gyventojuKiekis;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    public int getSostiniuKiekis() {
        return sostiniuKiekis;
    }

    public void setSostiniuKiekis(int sostiniuKiekis) {
        this.sostiniuKiekis = sostiniuKiekis;
    }

    public String getZemynas() {
        return zemynas;
    }

    public void setZemynas(String zemynas) {
        this.zemynas = zemynas;
    }

    @Override
    public String toString() {
        return "Valstybe{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", gyventojuKiekis=" + gyventojuKiekis +
                ", plotas=" + plotas +
                ", sostiniuKiekis=" + sostiniuKiekis +
                ", zemynas='" + zemynas + '\'' +
                '}';
    }
}
