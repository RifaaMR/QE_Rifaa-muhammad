import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan berat paket (kg): ");
            double berat = input.nextDouble();

            System.out.print("Masukkan jarak tempuh ke tujuan (km): ");
            double jarak = input.nextDouble();

            double biayaPaket = hitungBiayaPaket(berat);
            double biayaJarak = hitungBiayaJarak(jarak);

            if (biayaPaket == -1 || biayaJarak == -1) {
                System.out.println("Input tidak valid.");
            } else {
                double totalBiaya = biayaPaket + biayaJarak;
                System.out.println("Biaya pengiriman: Rp " + totalBiaya);
            }

            System.out.print("Apakah ingin menghitung biaya pengiriman lagi? (y/n): ");
            String jawaban = input.next();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjutkan = false;
            }
        }

        input.close();
    }

    public static double hitungBiayaPaket(double berat) {
        if (berat < 0) {
            return -1; // Berat tidak valid
        } else if (berat < 2) {
            return 10000;
        } else if (berat <= 7) {
            return 15000;
        } else if (berat <= 15) {
            return 25000;
        } else {
            return 40000;
        }
    }

    public static double hitungBiayaJarak(double jarak) {
        if (jarak < 0) {
            return -1; // Jarak tidak valid
        } else if (jarak < 1) {
            return 2000;
        } else if (jarak <= 7) {
            return 5000;
        } else if (jarak <= 15) {
            return 10000;
        } else {
            return 20000;
        }
    }
}
