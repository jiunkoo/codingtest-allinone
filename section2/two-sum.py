class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums = [(i, n) for i, n in enumerate(nums)]
        # nums.sort(key=lambda num: num[1])
        sorted_nums = sorted(nums, key=lambda num: num[1])
        i, j = 0, len(sorted_nums) - 1

        while i < j:
            sum = sorted_nums[i][1] + sorted_nums[j][1]
            if sum == target:
                return [sorted_nums[i][0], sorted_nums[j][0]]
            elif sum > target:
                j -= 1
            elif sum < target:
                i += 1

        return None
