import java.util.Scanner;

public class Eksplorasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        String camelCase = toCamelCase(kata);
        System.out.println("Camel Case: " + camelCase);

        input.close();
    }

    public static String toCamelCase(String kata) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : kata.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (capitalizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    camelCase.append(Character.toLowerCase(c));
                }
            } else {
                capitalizeNext = true;
            }
        }

        return camelCase.toString();
    }
}
