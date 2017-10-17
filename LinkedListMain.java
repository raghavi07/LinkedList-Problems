package linkedListFunctions;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String args[]) {// why do we need to declare main()
		// as static function?
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select any of the Operations to perform\n\t#1\tCreate Linked List of N nodes\n\t#2\tInsert at the start\n\t#3\tInsert at the middle(after node)\n\t#4\tInsert at the end\n\t#5\tInsert at the given position");
		System.out.println(
				"\t#6\tDelete at the start\n\t#7\tDelete at the middle(after node)\n\t#8\tDelete at the end\n\t#9\tDelete at the given position\n\t#10\tPrint the linked list\n\t#11\tCheck Data is present\n\t#12\tExit");
		LinkedList l = new LinkedList();
		int data, pos, node, n;
		System.out.println("Enter choice # -> ");
		int choice = sc.nextInt();
		while (choice != 12) {
			switch (choice) {
			case 1:
				System.out.println("Enter n -> ");
				n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					data = sc.nextInt();
					l.insertStart(data);
				}
				l.print();
				break;

			case 2:
				System.out.println("Enter data to be inserted at the start -> ");
				data = sc.nextInt();
				l.insertStart(data);
				l.print();
				break;

			case 3:
				System.out.println("\nEnter node after to be inserted -> ");
				node = sc.nextInt();
				System.out.println("\nEnter data to be inserted -> ");
				data = sc.nextInt();
				l.insertMiddle(node, data);
				l.print();
				break;

			case 4:
				System.out.println("Enter data to be inserted at the end -> ");
				data = sc.nextInt();
				l.insertEnd(data);
				l.print();
				break;

			case 5:
				System.out.println("\nEnter position to insert the new node -> ");
				pos = sc.nextInt();
				System.out.println("\nEnter new node data -> ");
				data = sc.nextInt();
				l.insertMiddleUsingPosition(pos, data);
				l.print();
				break;

			case 6:
				System.out.println("\nDeleting data at the start -> ");
				l.deleteStart();
				l.print();
				break;

			case 7:
				System.out.println("\nEnter node after to be deleted -> ");
				node = sc.nextInt();
				l.deleteMiddleData(node);
				l.print();
				break;

			case 8:
				System.out.println("\nDeleting data at the end -> ");
				l.deleteEnd();
				l.print();
				break;

			case 9:
				System.out.println("\nEnter position to be deleted -> ");
				pos = sc.nextInt();
				l.deleteMiddleUsingPosition(pos);
				l.print();
				break;

			case 10:
				l.print();
				break;

			case 11:
				System.out.println("\nEnter data to be checked -> ");
				data = sc.nextInt();
				System.out.println("Data Found -> " + l.isDataPresent(data));
				break;

			default:
				System.out.println("\nYou have entered the wrong choice, Enter Correct choice");

			}
			System.out.println("\nEnter choice # -> ");
			choice = sc.nextInt();
		}
		System.out.println("\n Exit Done ");
	}
}
