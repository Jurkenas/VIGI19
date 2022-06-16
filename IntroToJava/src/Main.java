import klases.Test;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            findCharsInText('a', args[i]);
        }

        String userInput = "  654654asdfasdf-23424351asdf aadfasdfasdf321//123 ";
        String userInputTrim = userInput.trim();

        char raide = '\u1300';

        Test testas = new Test();

        testas.setArgument1(1000);
        testas.setArgument2(10);
        testas.setArgument3("Staciakampis");

        System.out.println(testas.toString());


        String policyNo = "654654asdfasdf-2342435asdasd1asdf aadfasdfasdf321//123";

        String zodis = "StriRngras";
        String zodis2 = "strirngras";

        findCharsInText('r', zodis);

        System.out.println(zodis.substring(0, 3));

        if (zodis.equalsIgnoreCase(zodis2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println(orderTwoWords("bbb", "bbb"));

        System.out.println(userInput);
        System.out.println(policyNo);
        System.out.println(userInput.equals(policyNo));
        System.out.println(userInputTrim);
        System.out.println(policyNo);
        System.out.println(userInputTrim.equals(policyNo));


        int thousands = 3;
        int hundreds = 1;
        int tenths = 5;
        int ones = 7;

        String number = Integer.toString(thousands) + Integer.toString(hundreds) + String.valueOf(tenths) + String.valueOf(ones);
    }


    private static void findCharsInText(char charToFind, String text) {
        int firstIndexOfChar = text.indexOf(charToFind);
        int secondIndexOfChar = -1;
        int thirdIndexOfChar = -1;
        int fourthIndexOfChar = -1;

        if (firstIndexOfChar != -1) {
            secondIndexOfChar = text.indexOf(charToFind, firstIndexOfChar + 1);
            System.out.println("First '" + charToFind + "' in text: " + text + " is at index: " + firstIndexOfChar);
        } else {
            System.out.println("Char: '" + charToFind + "' is not present in text: " + text);
        }

        if (secondIndexOfChar != -1) {
            thirdIndexOfChar = text.indexOf(charToFind, secondIndexOfChar + 1);
            System.out.println("Second '" + charToFind + "' in text: " + text + " is at index: " + secondIndexOfChar);
        }
        if (thirdIndexOfChar != -1) {
            fourthIndexOfChar = text.indexOf(charToFind, thirdIndexOfChar + 1);
            System.out.println("Third '" + charToFind + "' in text: " + text + " is at index: " + thirdIndexOfChar);
        }
        if (fourthIndexOfChar != -1) {
            System.out.println("Fourth '" + charToFind + "' in text: " + text + " is at index: " + fourthIndexOfChar);
        }
    }

    private static String orderTwoWords(String firstWord, String secondWord) {
        int result = firstWord.compareTo(secondWord);

        if (result <= 0) {
            return firstWord + " " + secondWord;
        }

        return secondWord + " " + firstWord;
    }
}