import java.util.*;

public class nomor3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findTwoSum(nums1, target1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 3]

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println(Arrays.toString(result2)); // Output: [0, 2]
    }

    public static int[] findTwoSum(int[] nums, int target) {
        // Menggunakan Map untuk menyimpan angka dan indeksnya
        Map<Integer, Integer> map = new HashMap<>();

        // Melakukan iterasi pada array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Jika complement sudah ada dalam map, maka ditemukan pasangan
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            // Simpan angka dan indeksnya dalam map
            map.put(nums[i], i);
        }
        // Jika tidak ditemukan pasangan, return array kosong
        return new int[0];
    }
}
