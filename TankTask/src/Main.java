public class Main {
    public static void main(String[] args) {
        Tankas tankas1 = new Tankas(0, 0);
        tankas1.kairen();
        tankas1.kairen();
        tankas1.desinen();
        tankas1.atgal();
        tankas1.pirmyn();
        tankas1.kairen();
        tankas1.kairen();
        tankas1.kairen();
        tankas1.kairen();
        tankas1.atgal();
        System.out.println(tankas1.getX() + " " + tankas1.getY());
    }
}