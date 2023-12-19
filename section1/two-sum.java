import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }

        Arrays.sort(arr, (o1, o2) -> o2[1] - o1[1]);

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = arr[left][1] + arr[right][1];

            if (sum == target) {
                return new int[]{ arr[left][0], arr[right][0] };
            } else if (sum < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return new int[]{ -1, -1 };
    }
}
