class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        dic = {}
        for index, num in enumerate(nums):
            remainder = target - num
            if remainder in dic:
                return [dic[remainder], index]
            dic[remainder] = index

        return None
