package collection;

import java.util.ArrayDeque;

public class Queue_Interface {

	public static void main(String[] args) {
		ArrayDeque<Integer> arrQue = new ArrayDeque<Integer>();

		arrQue.add(10);
		arrQue.add(30);
		arrQue.add(5);
		arrQue.add(80);
		
		ArrayDeque<Integer> arrQue2 = new ArrayDeque<Integer>();
		//Queue is empty

//Methods in Queue:

		// 1- peek() -:retrieving the first data without removing from the queue,
		// but when no element present in queue (Queue is empty) then returns "null"

		System.out.println("peek method:" + arrQue.peek());
		System.out.println(arrQue);
		
        //when queue is empty
		System.out.println("peek method when queue is empty:"+arrQue2.peek());

		System.out.println("---------------------------------------------------------");
		// 2- element()-retrieving the first data without removing from the queue,
		// but when no element present in queue (Queue is empty) then throws
		// "NoSuchElementException"
		System.out.println("element method:" + arrQue.element());
		System.out.println(arrQue);
		

		/*
		 * when queue is empty
		 * System.out.println("element method when queue is empty:"+arrQue2.element());
		 * 
		 * System.out.println(
		 * "---------------------------------------------------------");
		 */

		// 3.poll() -: retrieving the first data by removing from the queue,
		// but when no element present in queue (Queue is empty) then returns "null"

		System.out.println("poll method:" + arrQue.poll());
		System.out.println(arrQue);
		
		/*
		 * //when queue is empty
		 * System.out.println("poll method when queue is empty:"+arrQue2.poll());
		 * 
		 * System.out.println(
		 * "---------------------------------------------------------");
		 */
		
		// 4.remove() -: retrieving the first data by removing from the queue,
				// but when no element present in queue (Queue is empty) then throws "NoSuchElementException"
System.out.println(arrQue.remove());
 System.out.println(arrQue);
		

	}

}
