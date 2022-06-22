/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
   An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

   Example 1:
   Input: s = "anagram", t = "nagaram"
   Output: true

   Example 2:
   Input: s = "rat", t = "car"
   Output: false
*/

/*
Approach 1: Convert both strings to charArray. Sort those charArrays. Compare if those charArrays are equal => return true.
Runtime: O(nlogn) => converting string to charArray is O(n), sorting takes some form of O(nlogn) so is dominant.
Space Complexity: 2 arrays are being made, so n + n => 2n => n
LC runtime + space: 7ms, 44.8 MB
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(tArray,sArray)) {
            return true;
        }
        return false;
    }
}