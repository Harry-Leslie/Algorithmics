package Lecture2.Stacks;

import java.util.Stack;

public class ArithmeticParsing {
    public int ArithmeticParser(String s){
        Stack<Character> stack = new Stack<>();

        Stack<Integer> stack1 = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (!(Character.isDigit(s.charAt(i)))){
                if (!(stack1.isEmpty())){
                    int n1 = Integer.parseInt(sb.toString());
                    int n2 = stack1.pop();
                    char op = stack.pop();
                    switch (op) {
                        case '+':
                            stack1.push(n1+n2);
                            break;
                        case '-':
                            stack1.push(n2-n1);
                            break;
                        case '*':
                            stack1.push(n1*n2);
                            break;
                        case '/':
                            stack1.push(n2/n1);
                            break;
                        default:
                            System.out.println("You Stupid");
                    }
                } else {
                    stack1.push(Integer.parseInt(sb.toString()));
                }
                sb = new StringBuilder();
                stack.push(s.charAt(i));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        char op = stack.pop();
        switch (op) {
            case '+':
                stack1.push(stack1.peek()+Integer.parseInt(sb.toString()));
                break;
            case '-':
                stack1.push(stack1.peek()-Integer.parseInt(sb.toString()));
                break;
            case '*':
                stack1.push(stack1.peek()*Integer.parseInt(sb.toString()));
                break;
            case '/':
                stack1.push(stack1.peek()/Integer.parseInt(sb.toString()));
                break;
            default:
                System.out.println("You Stupid");
        }


        return stack1.peek();
    }
}
