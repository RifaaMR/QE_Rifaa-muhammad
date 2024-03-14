public class HitungLuas {
    public static void main(String[] args) {
        // Menghitung dan menampilkan luas berbagai bangun datar
        System.out.println("Luas persegi: " + getSquareArea(12));
        System.out.println("Luas persegi panjang: " + getRectangleArea(7, 8));
        System.out.println("Luas lingkaran: " + getCircleArea(21));
        System.out.println("Luas trapesium: " + getTrapezoidArea(5, 6, 2));
    }

    // Menghitung luas persegi
    public static double getSquareArea(double sisi) {
        return sisi * sisi;
    }

    // Menghitung luas persegi panjang
    public static double getRectangleArea(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Menghitung luas lingkaran
    public static double getCircleArea(double jariJari) {
        double phi = 3.14;
        return phi * jariJari * jariJari;
    }

    // Menghitung luas trapesium
    public static double getTrapezoidArea(double sisi1, double sisi2, double tinggi) {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }
}
