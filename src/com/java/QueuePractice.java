package com.java;
import java.util.*;
public class QueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(2);
		pq.offer(8);
		pq.add(21);
		pq.offer(5);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.contains(21));
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		

	}

}
