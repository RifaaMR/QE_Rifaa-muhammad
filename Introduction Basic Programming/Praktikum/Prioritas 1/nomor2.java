import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        double luas = hitungLuasPersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang: " + luas);

        if (luas % 2 == 0) {
            System.out.println("even rectangle");
        } else {
            System.out.println("odd rectangle");
        }

        input.close();
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
}
