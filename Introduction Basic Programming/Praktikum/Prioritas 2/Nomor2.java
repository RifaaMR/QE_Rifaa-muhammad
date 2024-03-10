import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        String kataBaru = gantiHuruf(kata);
        System.out.println("Kata setelah diganti: " + kataBaru);

        input.close();
    }

    public static String gantiHuruf(String kata) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            switch (huruf) {
                case 'A':
                    hasil.append('4');
                    break;
                case 'E':
                    hasil.append('3');
                    break;
                case 'I':
                    hasil.append('1');
                    break;
                case 'O':
                    hasil.append('0');
                    break;
                case 'a':
                    hasil.append('4');
                    break;
                case 'e':
                    hasil.append('3');
                    break;
                case 'i':
                    hasil.append('1');
                    break;
                case 'o':
                    hasil.append('0');
                    break;
                default:
                    hasil.append(huruf);
                    break;
            }
        }
        return hasil.toString();
    }
}
