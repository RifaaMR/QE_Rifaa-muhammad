import java.util.*;

public class nomor1 {
    public static void main(String[] args) {
        String[] array1 = {"kucing ", "srigala", "katak", "burung"};
        String[] array2 = {"kucing", "burung", "harimau", "angsa"};

        String[] mergedArray = mergeAndRemoveDuplicates(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static String[] mergeAndRemoveDuplicates(String[] array1, String[] array2) {
        Set<String> mergedSet = new LinkedHashSet<>(Arrays.asList(array1));
        mergedSet.addAll(Arrays.asList(array2));

        return mergedSet.toArray(new String[0]);
    }
}
