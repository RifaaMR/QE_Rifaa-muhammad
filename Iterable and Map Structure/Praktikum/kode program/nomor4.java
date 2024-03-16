import java.util.*;

public class nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array pertama
        System.out.print("Masukkan nilai untuk array pertama : ");
        String input1 = scanner.nextLine();
        int[] array1 = parseInput(input1);

        // array kedua
        System.out.print("Masukkan nilai untuk array kedua : ");
        String input2 = scanner.nextLine();
        int[] array2 = parseInput(input2);

        // Mencari array unik
        int[] uniqueArray = getUniqueArray(array1, array2);
        System.out.println("Array dengan angka-angka unik : " + Arrays.toString(uniqueArray));

        scanner.close();
    }

    public static int[] parseInput(String input) {
        String[] tokens = input.split("\\s+");
        int[] array = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.parseInt(tokens[i]);
        }
        return array;
    }

    public static int[] getUniqueArray(int[] array1, int[] array2) {
        // Membuat set dari elemen-elemen array kedua
        Set<Integer> set = new HashSet<>();
        for (int num : array2) {
            set.add(num);
        }

        // Membuat list untuk menyimpan elemen-elemen unik dari array pertama
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : array1) {
            if (!set.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Mengonversi list ke array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }
}
