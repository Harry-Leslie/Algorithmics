package Tutorials2;

import java.util.*;

public class Question3 {
    /* Stimulating a queue using two
     * stacks requires you to think outside
     * the box
     * 
     * A queue requires a head at the front
     * now there is an issue as when 
     * you add something to the stack
     * it will not come out until everything above
     * it is gone 
     * 
     * lets go through an example
     * 
     * enqueue(1)
     * enqueue(2)
     * enqueue(3)
     * dequeue() -> should return 1
     * dequeue() -> should return 2
     * enqueue(6)
     * 
     * 1) stack 1 = [1, top] stack 2 = [top]
     * 2) stack 1 = [1, 2, top] stack 2 = [top]
     * 3) stack 1 = [1, 2, 3, top] stack 3 = [top]
     * 4) so for this you need to move all the elements
     * in stack 1 to stack 2 to get the first element
     * 
     * stack 1 [1, top] stack 2 [3, 2, top]
     * then stack 1 remove 1 and returns it leaving stack 1 empty
     * 
     * then you put all the elements back into stack 1
     * 
     * so it will be stack 1 [2, 3, top] stack 2 [top]
     * 5) stack 1 [3, top] stack [top]
     * 6) stack 1 [3, 6, top] stack[top]
     * 
     * Time Complexity => for enqueuing Theta(1) while for dequeuing Theta(N)
     * 
     * I know firstly there is a better way to do that has the same time complexity
     * as this method but due to the other method not being as intuitive for my small
     * brain im doing this method, here is a link if you would like to understand 
     * this problem more. https://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks
     *  
     *
     */

    public class Queue{

    private ArrayList<Integer> stack1 = new ArrayList<>();
    private ArrayList<Integer> stack2 = new ArrayList<>();

    public void enqueue(int val) {
        stack1.add(val);
    }

    public int dequeue() {
        while (!stack1.isEmpty()){
            stack2.add(stack1.remove(stack1.size()-1));
        }

        int temp = stack2.remove(stack2.size()-1);
        while(!stack2.isEmpty()){
            stack1.add(stack2.remove(stack2.size()-1));
        }
        return temp;
    }

}

}
