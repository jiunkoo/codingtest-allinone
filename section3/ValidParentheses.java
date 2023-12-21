import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if (stack.size() == 0 && (ch == ')' || ch == '}' || ch == ']')) {
                return false;
            }

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
                continue;
            }

            char last = stack.lastElement();
            if ((last != '(' && ch == ')') || (last != '{' && ch == '}') || (last != '[' && ch == ']')) {
                return false;
            }
            stack.pop();
        }

        return stack.size() == 0 ? true : false;
    }
}
