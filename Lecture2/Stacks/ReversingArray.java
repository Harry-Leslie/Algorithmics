package Lecture2.Stacks;

import java.util.Stack;

public class ReversingArray<E> {
    public E[] reverseWithStack(E[] arr){
        Stack<E> stack = new Stack<>();
        for (E e : arr) {
            stack.push(e);
        }
        int i = 0;
        while (!(stack.isEmpty())){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }
}
