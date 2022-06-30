// Approach 1
// Used StringBuilder so that string is mutable.
// Time: O(n)
// Space: O(n)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNumString = new StringBuilder();

        for (char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                alphaNumString.append(c);
            }
        }

        String newString = alphaNumString.toString();
        String revStr = alphaNumString.reverse().toString();

        return newString.equalsIgnoreCase(revStr);
    }
}



// Approach 2
// Used 2 pointer approach, so that space complexity O(1).
// Time: O(n)
// Space: O(1)
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }

        return true;
    }
}