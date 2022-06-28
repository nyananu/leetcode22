# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


# Approach 1 : Use an empty map, with the array value as key and its index as value. Go through array, and find difference between
# the target value and the current value. Check to see if that difference is in the map. If so, return that value and the current index.
# if not, then put it in the map.
# Runtime: O(n) - go through Array once, to include elements in the array.
# Space Complexity: 1 set being made so O(n)
# LC runtime + space: 115ms, 15.2 MB

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # initialize an empty map with value as the index

        prevMap = {} # val -> index

        for i, n in enumerate(nums):
            diff = target - n
            print(diff)
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i
