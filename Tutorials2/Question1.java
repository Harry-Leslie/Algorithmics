package Tutorials2;

public class Question1 {
    /* Two implement two stacks with one array you 
     * need to use a double ended technique
     * you will need a top which goes from both sides
     * this allows you to implement 2 stacks with
     * a stack size of N
     */
    int[] stack;
    int topleft;
    int topright;
    Question1(int N){
        this.stack = new int[N];
        this.topleft = 0;
        this.topright = N-1;
    }
    public void pushleft(int val) {
        if (this.topleft < this.topright){
            this.stack[this.topleft]=val;
            this.topleft++;
        }
    }

    public void pushright(int val) {
        if (this.topleft < this.topright){
            this.stack[this.topright]=val;
            this.topright--;
        }
    }
    
    public int popleft() {
        if (this.topleft >= 0){
            int r = this.stack[this.topleft];
            this.topleft--;
            return r;
        }
        return -1;
    }

    public int popright() {
        if (this.topright >= 0){
            int r = this.stack[this.topright];
            this.topright++;
            return r;
        }
        return -1;
    }

}
