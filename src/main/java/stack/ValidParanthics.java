package stack;

import java.util.Stack;

public class ValidParanthics {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }

            else if(c == ']'){
                if(stack.empty() || stack.pop() != '['){
                    return false;
                }
            }
            else if(c == '}'){
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            }
            else if(c == ')'){
                if(stack.empty() || stack.pop() != ')'){
                    return false;
                }
            }
            }
        if (stack.empty()){
            return true;
        }
        else
            return false;
        }

    public static void main(String[] args) {

        String s = "[{()}]";

        if(isValid(s)){
            System.out.println("that is a valid parenthis");
        }
        else
            System.out.println("not a valid ");
    }
}
