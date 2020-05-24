package linkedListFunctions;

import linkedListFunctions.LinkedList.Node;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void print() {
		if (head == null) {
			return;
		}

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "   ");
			temp = temp.next;
		}
	}

	public int getNodeLength() {
		if (this.head == null) {
			return 0;
		}
		int count = 0;
		Node temp = this.head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void insertAfter(int target, int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			return;
		}
		Node temp = this.head;
		while (temp != null) {
			if (temp.data == target) {
				newNode.next = temp.next;
				temp.next = newNode;
				return;
			}
			temp = temp.next;
		}
	}

	public void insertAfterUsingPosition(int pos, int data) {
		
		if (this.head == null) {
			if (pos == 1) {
				Node newNode = new Node(data);
				this.head = newNode;
			}
			return;
		}
		if (pos == 1) {
			Node newNode = new Node(data);
			newNode.next=this.head;
			this.head=newNode;
			return;
		}
		Node temp = this.head;
		for (int count = 1;temp != null;count++,temp = temp.next) {
			if (count == pos-1) {
				Node newNode = new Node(data);
				newNode.next = temp.next;
				temp.next=newNode;
				return;
			}
		}
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
			return;
		}
		Node temp = this.head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void deleteNodeWithGivenData(int target) {
		if (this.head == null) {
			return;
		}
		if (this.head.data == target) {
			this.head = this.head.next;
			return;
		}
		Node temp = this.head;
		while (temp != null) {
			if (temp.next.data == target) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	public void deleteAfterUsingPosition(int pos) {
		if (this.head == null) {
			return;
		}
		
		if (pos == 1) {
			this.head = this.head.next;
			return;
		}
		Node temp = this.head;
		int count = 1;
		while (temp != null) {
			count++;
			if (count == pos) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	public void deleteStart() {
		if (this.head == null) {
			return;
		}
		this.head = this.head.next;
	}

	public void deleteEnd() {
		if (this.head == null) {
			return;
		}

		Node temp = this.head;
		if (temp.next == null) {
			this.head = null;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	public boolean isPresent(int target) {
		if (this.head == null) {
			return false;
		}
		Node temp = this.head;
		while (temp != null) {
			if (temp.data == target) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public Node getDataNode(int target) {
		if (this.head == null) {
			return null;
		}
		Node temp = this.head;
		if (temp.data == target) {
			return this.head;
		}

		while (temp.next != null) {
			if (temp.next.data == target) {
				return temp.next;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void reverse() {
        Node prev = null;
        Node current = this.head;
        Node next = current.next;
        while (current != null) {
            next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }
	
	public Node getFirstNode () {
		if (head == null) {
			return null;
		}
		return this.head;
	}
	
	public int lengthRecursive(Node head) {
		if (head == null) {
			return 0;
		}
		return 1 + lengthRecursive(head.next);
	}
}
