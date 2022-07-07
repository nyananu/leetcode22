// Approach 1
/*
1) check string length, it has to be even. if not, return false.
2) if even, go through string and push opening bracket into stack
3) if stack is empty, means no opening bracket put -> return false eg ")]}"
4) check each char, and if popped brace is not it's opposite -> return false (because ordered braces)
5) after all popping, even then if stack is not empty -> return false, else true "(){}[["

Time: O(n)
Space: O(1)
*/
public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            Stack<Character> stack = new Stack<>();
            for(char a: s.toCharArray()){
                if(a == '(' || a == '[' || a == '{') {
                    stack.push(a);
                }else if(stack.empty()) {
                    return false;
                }
                else if(a == ')' && stack.pop() != '(') {
                    return false;
                }else if(a == ']' && stack.pop() != '[') {
                    return false;
                }else if(a == '}' && stack.pop() != '{') {
                    return false;
                }
            }
            return stack.empty();
        }
        return false;
    }
}