package Lecture2.Queues;

import java.util.*;
import datastructures.Tree;

public class LectureNotes {
    /* Queue work by adding to the end of the list
     * and removing from the front of the list
     * 
     * Queue TC
     * 
     * Enqueue: TC O(1)
     * Dequeue: TC O(1)
     * Peak: TC O(1)
     * 
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // or new PriorityQueue
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.poll();
        queue.peek();


        Tree<Integer> tree = new Tree<Integer>(3, new Tree<>(4, new Tree<>(2), null), new Tree<>(9));

        /* tree looks like this 
         * 
         *              3
         *          4       9
         *       2
         * 
         *  The output should look like this 3 4 9 2 (Hint: it will be like this you can edit the tree above if you dont believe me :) )
         */

        Bfs.treeBFS(tree); 
    }
    
}
