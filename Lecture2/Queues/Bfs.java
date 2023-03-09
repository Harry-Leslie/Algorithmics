package Lecture2.Queues;
import datastructures.Tree;
import java.util.*;
public class Bfs {

    /* BFS can be used to go through a Tree or Graph
     * with bfs you are able to go through a binary 
     * tree layer by layer because the tree you add 
     * the next layer into the queue and you keep adding
     * until you get to the end which you would add none
     * 
     * I will do this implementation for a binary tree
     * but you would have to change the code for a graph
     * as because graphs can be cyclic you need to add
     * an extra data structure to stop you from going 
     * to points that you have not seen before
     */

    public static void treeBFS(Tree<Integer> root){
        if (root == null){
            return;
        }
        Queue<Tree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Tree<Integer> current = queue.poll();
            System.out.print(current.element.toString() + ' ');
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
        return;
    }


}
