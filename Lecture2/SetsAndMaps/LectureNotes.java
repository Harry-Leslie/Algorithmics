package Lecture2.SetsAndMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LectureNotes {
    /*
    *
    * Sets Time Complexity
    *
    * Insertion O(1)
    * Deletion O(1)
    * Searching O(1)
    *
    * sets are not order, and you can not have repeated elements
    *
    *
    * Maps Time Complexity
    *
    * Insertion O(1)
    * Deletion O(1)
    * Searching O(1)
    *
    * maps are very similar to sets but are in key-value pairs
    *
    * you could make a hashmap using a set that contains a linked list
    * of length where you would store the key in the hashmap
    *
    * sets and maps achieve such a low time complexity because
    * they use hashing techniques which allows you to search through
    * a hashmap quickly
    *
    * when implementing in java you want to use the interfaces and not
    * implementations */
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Map<Integer, Integer> m1 = new HashMap<>();
        // this is how you should create a new hashset and hashmap
        // this is because Set requires uses generic which require parameterisation

        HashSet s2 = new HashSet();
        HashMap m2 = new HashMap();
        // HashSet does not use generics, so you can have different objs
        // this is a big problem as type handling

        // because sets and maps have such a fast access time they can reduce
        // the time complexity of algorithms quite significantly
        // for example c





    }
}
