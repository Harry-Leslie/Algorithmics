package Lecture2.Stacks;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class LectureNotes {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // YOU CAN ALSO SAY
        Vector<String> stack2 = new Stack<>();
        // AS STACK EXTENDS but that means it gets all the methods from vector
        ReversingArray<Integer> example1 = new ReversingArray<>();
        ParsingExpression example2 = new ParsingExpression();
        ArithmeticParsing parser = new ArithmeticParsing();

        System.out.println(Arrays.toString(example1.reverseWithStack(new Integer[]{2, 5, 1, 8, 1})));


        /* XML tags would work in a simpler way to balancedParentheses you just need to think
         * instead of brackets its XML tags/ well in implementation it would probably a class instead but
         * yh same thing */


        System.out.println(example2.balancedParentheses("(()(())")); // returns false


        /* This is a very simplified arithmetic parser you would normally firstly use postfix
        notation if you are making a parser so you can implement order of operations
        but this is just a simple example of how the stack maybe be used as a parser
         */


        System.out.println(parser.ArithmeticParser("43+22/5"));

        /* Stacks have are used in other places such as dfs/recursion questions
        you want to use a stack when you need to compare two things with each other
        like with the balanced parentheses. You want to use it when there are only
        2 comparisons needed (unless dfs/recursion problem)

        all operations take a O(1) TC so they are pretty good
         */
    }
}
