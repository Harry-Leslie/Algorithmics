package Lecture2.Stacks;

import java.util.Stack;

public class ParsingExpression {
    public boolean balancedParentheses(String s){
        Stack<Character> stack = new Stack<Character>();
        for(Character letter : s.toCharArray()){
            if (letter.equals(')')){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            } else {
                stack.push(letter);
            }
        }
        return stack.size() == 0;
    }
}
