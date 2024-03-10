import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = input.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.println("Angka yang habis dibagi :" + n + ":");
        int counter = 0;
        for (int i = 1; counter < jumlahAngka; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
                counter++;
            }
        }

        input.close();
    }
}
