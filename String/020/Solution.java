class Solution {

    char leftChar1 = "(";
    char leftChar2 = "{";
    char leftChar3 = "[";
    char rightChar1 = ")";
    char rightChar2 = "}";
    char rightChar3 = "]";

    public boolean isValid(String s) {
        if(s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}