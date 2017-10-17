package linkedListFunctions;

import java.util.Scanner;

public class QueueUsingLinkedList {

	LinkedList l = new LinkedList();

	public void push(int data) {
		l.insertStart(data);
	}

	public void pop() {
		l.deleteEnd();
	}
	
	public int getQueueSize() {
		return l.length();
	}
	
	public void search(int data) {
		System.out.println ("\nData Fount -> " +l.isDataPresent(data));
	}

	public void print() {
		l.print();
	}
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		QueueUsingLinkedList s = new QueueUsingLinkedList();
		
		System.out.println("Enter n -> ");

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			s.push(data);
		}
		System.out.println("Full Stack -> ");
		s.print();
		
		System.out.println("\nPop -> ");
		s.pop();
		s.print();
		System.out.println("Queue Size -> "+s.getQueueSize());
		System.out.println("\nPop -> ");
		s.pop();
		s.print();
		System.out.println("Queue Size -> "+s.getQueueSize());
		System.out.println("\nEnter data to search -> ");
		int data = sc.nextInt();
		s.search(data);
		
		
	}
}
