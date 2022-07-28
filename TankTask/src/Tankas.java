public class Tankas {

    private int x;
    private int y;
    private Kryptis kryptis;

    // sunkiau suprasti, be papildomos informacijos nera aisku ka kuris skaicius reiskia
    private int[] suviai = {0, 0, 0, 0}; // Š, R, P, V

    // geresnis variantas, nekyla papildomu klausimu, aiskiai matosi ka kuriame kintamajame saugome
    private int suviaiSiaure;
    private int suviaiPietus;
    private int suviaiVakarai;
    private int suviaiRytai;

    public Tankas(int x, int y, Kryptis kryptis) {
        this.x = x;
        this.y = y;
        this.kryptis = kryptis;
    }

    public Tankas(int x, int y) {
        this.x = x;
        this.y = y;
        this.kryptis = Kryptis.SIAURE;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Kryptis getKryptis() {
        return kryptis;
    }

    public void setKryptis(Kryptis kryptis) {
        this.kryptis = kryptis;
    }

    public void atgal() {
        this.kryptis = Kryptis.PIETUS;
        y--;
        tankoJudejimoSpausdinimas();
    }

    public void desinen() {
        this.kryptis = Kryptis.RYTAI;
        x++;
        tankoJudejimoSpausdinimas();
    }

    public void kairen() {
        this.kryptis = Kryptis.VAKARAI;
        x--;
        tankoJudejimoSpausdinimas();
    }

    public void pirmyn() {
        this.kryptis = Kryptis.SIAURE;
        y++;
        tankoJudejimoSpausdinimas();
    }

    private void tankoJudejimoSpausdinimas() {
        System.out.printf("Tankas pajuda į %-10s (%2d;%2d) \n", getKryptis().getIKur(), getX(), getY());
    }

    private void suvisSpausdinimas(){
        System.out.printf("Šūvis į %-10s\n", getKryptis().getIKur());
    }

    public void suvis() {
        switch (kryptis) {
            case SIAURE:
                suviai[0]++;
                suviaiSiaure++;
                suvisSpausdinimas();
                break;
            case RYTAI:
                suviai[1]++;
                suviaiRytai++;
                suvisSpausdinimas();
                break;
            case PIETUS:
                suviai[2]++;
                suviaiPietus++;
                suvisSpausdinimas();
                break;
            case VAKARAI:
                suviai[3]++;
                suviaiVakarai++;
                suvisSpausdinimas();
                break;
            default:
                System.out.println("Suvis i sia krypti negalimas");
        }
    }

    private int suviaiIsViso(){
        return suviaiSiaure + suviaiRytai + suviaiPietus + suviaiVakarai;
    }
    public void info(){
        System.out.print("\n ------------ INFO ------------\n");
        System.out.printf("Tanko koordinatės: (%3d;%3d)\n", getX(), getY());
        System.out.printf("Tanko kryptis: %10s\n", getKryptis());
        System.out.println("Tanko šūviai:");
        System.out.printf("  %-10s %2d\n","Į šiaurę:", this.suviaiSiaure);
        System.out.printf("  %-10s %2d\n","Į rytus:", this.suviaiRytai);
        System.out.printf("  %-10s %2d\n","Į pietus:", this.suviaiPietus);
        System.out.printf("  %-10s %2d\n","Į vakarus:", this.suviaiVakarai);
        System.out.printf("\n  %-10s %2d\n","Iš viso:", suviaiIsViso());
        System.out.print(" ------------------------------\n\n");
    }
}
