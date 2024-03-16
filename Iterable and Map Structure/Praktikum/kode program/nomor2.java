import java.util.*;

public class nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai : ");
        String input = scanner.nextLine();

        // Menemukan angka-angka yang hanya muncul satu kali
        List<Integer> uniqueNumbers = findUniqueNumbers(input);

        // Menampilkan output
        System.out.println("Nilai yang muncul satu kali: " + uniqueNumbers);

        scanner.close();
    }

    public static List<Integer> findUniqueNumbers(String input) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Hitung frekuensi setiap angka dalam input
        for (char digit : input.toCharArray()) {
            int num = Character.getNumericValue(digit);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Simpan angka yang hanya muncul satu kali dalam list
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }

        return uniqueNumbers;
    }
}
