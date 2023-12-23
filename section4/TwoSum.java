import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
 
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (hashMap.containsKey(remainder)) {
                return new int[]{ hashMap.get(remainder) , i };
            }
            hashMap.put(nums[i], i);
        }

        return new int[]{ -1, -1 };
    }
}
