package Tutorials2;

public class Question5<E> {
    /* With this question you need to be careful with pointers
     * so with this question what you want to do 
     * is break the link of the element you want to remove
     * 
     * example time 
     * 
     * 3->4->5->7->Null you want to remove 5
     * 
     * so what happens is you do 
     *           3   ->   4  ->   5   ->  7   ->  Null
     *   prev   ptr
     * *           3   ->   4  ->   5   ->  7   ->  Null
     *            prev     ptr
     * *           3   ->   4  ->   5   ->  7   ->  Null
     *                      prev   ptr
     * 
     * the prev ptr is need to that you can link 4 with 7 instead of 5
     * which breaks 5 out of the chain
     * 
     *  so you will have 3 -> 4 -> 5 -> 7 -> N
     * 
     * ptr starts at the head and 
     */
    public void removeElement(Node<E> head, Node<E> element){
        if (head.equals(element)){
            head=head.next;
        }
        Node<E> ptr = head;
        Node<E> prev = null;
        while (ptr!=null){
            if (ptr.equals(element)){
                prev.next = ptr.next;
            }
            prev=ptr;
            ptr = ptr.next;
        }
    }
}
