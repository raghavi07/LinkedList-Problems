package linkedListFunctions;

import java.util.Scanner;

import linkedListFunctions.LinkedList.Node;

public class StackUsingLinkedList {
	LinkedList l = new LinkedList();

	public void push(int data) {
		l.insertEnd(data);
	}

	public void pop() {
		l.deleteEnd();
	}

	public Node front() {
		if (l.head == null) {
			System.out.println(" -- Stack Is Empty -- ");
			return null;
		}
		Node temp = l.head;
		if (temp.next == null) {
			return l.head;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		return temp.next;
	}

	public int getStackSize() {
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
		StackUsingLinkedList s = new StackUsingLinkedList();
		
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
		System.out.println("\nPop -> ");
		s.pop();
		s.print();
		System.out.println("\nEnter data to search -> ");
		int data = sc.nextInt();
		s.search(data);
	}
}
