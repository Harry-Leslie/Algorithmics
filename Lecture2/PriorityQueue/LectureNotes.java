package Lecture2.PriorityQueue;

import java.util.*;
import java.io.*;

public class LectureNotes {

    public static void main(String[] args) {
        /*
        Priority Queue Time Complexity for operation
        * insertion O(logN)
        * deletion O(logN)
        * peeking O(1)
        *  */

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Heap Sort works using a priority queue which puts the
        HeapSort heapSort = new HeapSort(new Integer[]{4, 5, 2, 8, 4, 5, 23, 43});
        heapSort.sort(); // TC: O(NlogN)

    }
}
