/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

/*
Approach 1 : Use a Set. Add array elements to the set. If set length is < Array length, there was a duplicate => return true
Runtime: O(n) - go through Array once, to include elements in set.
Space Complexity: 1 set being made so O(n)
LC runtime + space: 37ms, 74.9 MB
*/
class Solution {
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet();

    for (int eachNumber : nums) {
        set.add(eachNumber);
    }

    if(set.size() < nums.length) {
        return true;
    }
    return false;
  }
}


/*
Approach 2 : Use a Map. Put Array elements in map as key, checking if it doesn't exist already. return true on first failure
Runtime: O(n) - worst case is there is no duplicate so we loop through whole array.
Space Complexity: 1 Map being made so O(n)
LC runtime + space: 8ms, 55 MB
*/
class Solution {
public boolean containsDuplicate(int[] nums) {
    Map map = new HashMap();

    for (int eachNumber : nums) {
        if (map.containsKey(eachNumber)) {
            return true;
        } else {
            map.put(eachNumber, 1);
        }
    }
    return false;
  }
}