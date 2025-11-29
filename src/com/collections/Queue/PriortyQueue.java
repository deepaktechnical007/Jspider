package com.collections.Queue;


import java.util.PriorityQueue;

public class PriortyQueue {

    public static void main(String[] args) {

        PriorityQueue<String> pq1 = new PriorityQueue<>();

        pq1.add("A");
        pq1.add("C");
        pq1.add("B");
        pq1.add("D");
        pq1.add("E");
        pq1.add("C");

        System.out.println("Size : "+ pq1.size());
        System.out.println("isEmpty : "+pq1.isEmpty());


        while (pq1.isEmpty()!=true)
        {
            System.out.println(pq1.poll());
        }

        System.out.println("size : "+pq1.size());
        System.out.println("isEmpty : "+ pq1.isEmpty());
    }

}
