public class Tankas {

    private int x;
    private int y;
    private Kryptis kryptis;

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

    private void tankoJudejimoSpausdinimas(){
        System.out.printf("Tankas pajuda į %-10s (%2d;%2d) \n", getKryptis().getIKur(), getX(), getY());
    }
}
