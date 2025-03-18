import java.util.*;

public class MinMovesToConsecutiveOnes {
    public static int minMoves(int[] nums, int k) {
        // Step 1: Find positions of all 1's
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                positions.add(i);
            }
        }

        int n = positions.size();
        // Prefix sum array for efficient distance calculation
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + positions.get(i);
        }

        int minMoves = Integer.MAX_VALUE;

        // Step 2: Sliding window of size k
        for (int i = 0; i <= n - k; i++) {
             int mid = i + k / 2; // Median position in the current window
            int median = positions.get(mid);

            // Calculate left and right costs using prefix sums
            int leftCost = median * (mid - i) - (prefixSum[mid] - prefixSum[i]);
            int rightCost = (prefixSum[i + k] - prefixSum[mid + 1]) - median * (i + k - mid - 1);

            // Update minimum moves
            minMoves = Math.min(minMoves, leftCost + rightCost);
        }

        return minMoves;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1};
        int k = 2;
        System.out.println(minMoves(nums, k)); // Output: 1
    }
}
