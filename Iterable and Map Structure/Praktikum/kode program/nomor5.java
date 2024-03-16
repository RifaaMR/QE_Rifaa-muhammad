public class nomor5 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 4, 5, 5, 5};
        int length1 = removeDuplicates(nums1);
        System.out.println("Panjang subarray yang tidak memiliki duplikat: " + length1);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            // Jika angka saat ini tidak sama dengan angka sebelumnya, tambahkan ke subarray
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }

        // Panjang subarray adalah index + 1
        return index + 1;
    }
}
