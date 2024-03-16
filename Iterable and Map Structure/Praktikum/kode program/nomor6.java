public class nomor6 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 1, 5};
        int k = 2;
        int maxSum = findMaxSubarraySum(arr, k);
        System.out.println("Output: " + maxSum); // Output: 7
    }

    public static int findMaxSubarraySum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
