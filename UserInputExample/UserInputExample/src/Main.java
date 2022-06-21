import enums.Zemynai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sukurtiValstybes(Integer.parseInt(args[0]));
    }

    private static void sukurtiValstybes(int kiekis) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= kiekis; i++) {
            Valstybe valstybe = new Valstybe();
            System.out.println("----------------------------------------------------");
            System.out.println("--- " + i + " VALSTYBE ---");
            System.out.println("Įveskite pavadinimą:");
            valstybe.setPavadinimas(scanner.next());

            System.out.println("Įveskite valstybės '" + valstybe.getPavadinimas() + "' gyventojų kiekį: ");
            valstybe.setGyventojuKiekis(scanner.nextInt());

            System.out.println("Įveskite valstybės '" + valstybe.getPavadinimas() + "' plotą: ");
            valstybe.setPlotas(scanner.nextDouble());

            valstybe.setZemynas(Zemynai.AZIJA.klimatoJuosta());

            System.out.println(valstybe);
            System.out.println("Plotas tenkantis zmogui:" + valstybe.getPlotasGyventojui());
            System.out.println("----------------------------------------------------");
        }
        scanner.close();
    }
}