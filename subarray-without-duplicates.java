import java.util.*;

class Solution {
    public int maximumSum(int[] arr) {
        int i = 0, sum = 0, maxSum = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < arr.length; j++) {

            while (set.contains(arr[j])) {
                set.remove(arr[i]);
                sum -= arr[i];
                i++;
            }

            set.add(arr[j]);
            sum += arr[j];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}