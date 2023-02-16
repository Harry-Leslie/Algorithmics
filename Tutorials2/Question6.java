package Tutorials2;

public class Question6<E> {

    /* This problem is not to bad, the main issue with
     * this problem which isnt mentioned is what if n > than the length of the list
     * you would be wasting time if you had n = 100000000000 for a doubly linked list
     * with length 3, instead it would be fast to do n%3 and use that to find the location
     * where n would be 
     * 
     * for example 
     * 
     * 1 = 4 = 5 = 7
     * 
     * n = 12
     * if you do 12%4 that would be 0 so that means
     * that you will insert at the 0th index 
     * instead of actually going around the list 3 times you only go once
     * 
     * which saves time 
     * 
     * in fact the time complexity decreases from O(n*(k%n)) to O(n)
     * 
     * However, with this example I am going to make the assumption 
     * that n < length of the list 
     * 
     * as finding the length of a linked list is trivial 
     * finding the length of a double linked list isnt as trivial 
     * but it is still quite easy
     */
    public void add(Node<E> head, Node<E> newElement, int n) {
        Node<E> ptr = head;
        for (int i = 0; i < n; i++){
            ptr=ptr.next;
        }
        Node<E> temp = ptr.next;
        ptr.next = newElement;
        newElement.next=temp;
    }
}
