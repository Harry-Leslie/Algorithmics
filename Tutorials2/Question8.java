package Tutorials2;

public class Question8<E> {
    /* Reversing a linked list is a interesting problem
    you need to have 3 pointers
    to be able to reverse a linked list 
    
    here is a picture to understand what is going on 
    https://i2.wp.com/techieme.in/wp-content/uploads/llreverse.png?zoom=2&resize=753%2C661
    

    with reversal the issue is that you can easily reverse two nodes links
    with two pointers like current and prev but if you want reverse the entire
    list you need another pointer which carries on moviing foward
     */
    public Node<E> reverse(Node<E> node){
        Node<E> prev = null;
        Node<E> current = node;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
