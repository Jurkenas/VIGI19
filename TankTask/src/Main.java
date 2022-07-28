import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tankas tankas = new Tankas(0, 0, Kryptis.RYTAI);
        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;
        while(runProgram){
            showCommands();
            String input = scanner.next();
            switch (input){
                case "s":
                    tankas.pirmyn();
                    break;
                case "r":
                    tankas.desinen();
                    break;
                case "p":
                    tankas.atgal();
                    break;
                case "v":
                    tankas.kairen();
                    break;
                case "*":
                    tankas.suvis();
                    break;
                case "i":
                    tankas.info();
                    break;
                case "x":
                    runProgram = false;
                default:
                    System.out.println("komanda [" + input + "] nepalaikoma");
            }
        }
        scanner.close();
    }

    public static void showCommands() {
        System.out.println("----------- PASIRINKITE -----------");
        System.out.printf("%5s - %-15s", "[s]", "ėjimas į Šiaurę");
        System.out.printf("\n%5s - %-15s", "[r]", "ėjimas į Rytus");
        System.out.printf("\n%5s - %-15s", "[p]", "ėjimas į Pietus");
        System.out.printf("\n%5s - %-15s", "[v]", "ėjimas į Vakarus");
        System.out.printf("\n%5s - %-15s", "[*]", "šūvis");
        System.out.printf("\n%5s - %-15s", "[i]", "info");
        System.out.printf("\n%5s - %-15s", "[x]", "pabaiga");
        System.out.println("\n-----------------------------------");
    }
}