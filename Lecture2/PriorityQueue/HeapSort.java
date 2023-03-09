package Lecture2.PriorityQueue;

import java.util.*;

public class HeapSort extends PriorityQueue<Integer>{
    Integer[] array;
    PriorityQueue<Integer> queue;
    HeapSort(Integer[] array){
        this.array=array;
        this.queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public void sort(){
        this.queue.addAll(Arrays.asList(this.array));
        for (int i = 0; i < this.array.length; i++){
            int tmp = this.queue.poll();
            System.out.println(tmp);
        }

    }

}



