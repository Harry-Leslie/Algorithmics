package Tutorials2;

public class Question2 {
    /* To implement a queue of a fixed size with
     * and array you can have a head
     * which acts as the front of the queue
     * 
     */
    int[] queue;
    int head;
    Question2(int N){
        this.queue = new int[N];
        this.head = 0;
    }
    
    public void enqueue(int val) throws Exception {
        if (this.head == this.queue.length){
            throw new RuntimeException("Queue Full");
        } else{
            this.queue[this.head] = val;
            this.head++;
        }
    }

    public int dequeue() throws Exception{
        if (this.head <= 0){
            throw new RuntimeException("Queue Empty");
        } else {
            int r = this.queue[this.head];
            this.head--;
            return r;
        }
    }
}
