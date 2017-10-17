package linkedListFunctions;

import java.util.Scanner;

import linkedListFunctions.LinkedList.Node;

public class LinkedListLoop {

	LinkedList l = new LinkedList();

	public boolean detectLoop() {
		if (l.head == null) {
			System.out.println(" -- Head is null -- ");
			return false;
		}
		Node fast = l.head.next;
		Node slow = l.head;
		try {
		while (fast.next != null && slow.next != null) {
			if (fast.data == slow.data) {
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		}
		catch (Exception NullPointerException) {
			return false;
		}
		return false;
	}

	public void getLoopDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n -> ");
		int n = sc.nextInt();
		int data;
		for (int i = 0; i < n; i++) {
			data = sc.nextInt();
			l.insertStart(data);
		}
		System.out.println("Enter loop 1 data -> ");
		int loop1 = sc.nextInt();
		System.out.println("Enter loop 2 data -> ");
		int loop2 = sc.nextInt();
		createLoop(loop1, loop2);
	}

	public void createLoop(int loop1, int loop2) {
		if (l.head == null) {
			System.out.println(" -- Head is null -- ");
			return;
		}
		Node temp, temp1;
		temp = l.getDataNode(loop1);
		temp1 = l.getDataNode(loop2);
		temp1.next = temp;
	}

	public static void main(String args[]) {
		LinkedListLoop lp = new LinkedListLoop();
		lp.getLoopDetails();
		System.out.println("Loop Present -> " + lp.detectLoop());
	}
}
