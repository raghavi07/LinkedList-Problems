package linkedListFunctions;

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

	public void insertMiddle(int data, int toInsert) {
		Node newNode = new Node(toInsert);
		if (this.head == null) {
			System.out.println("  Head is null ");
			return;
		}
		Node temp = this.head;
		while (temp != null) {
			if (temp.data == data) {
				System.out.println("  Found after node to be inserted ");
				newNode.next = temp.next;
				temp.next = newNode;
			}
			temp = temp.next;
		}
		System.out.println("** Not Found after node to be inserted **");
	}

	public void insertMiddleUsingPosition(int pos, int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			System.out.println("  Head is null ");
			if (pos == 1) {
				this.head = newNode;
			}
			return;
		}
		Node temp = this.head;
		Node prev = this.head;
		int count = 1;
		while (temp != null) {
			if (count == pos) {
				System.out.println("  Found after node to be inserted ");
				prev.next = newNode;
				newNode.next = temp;
			}
			count++;
			prev = temp;
			temp = temp.next;
		}
		System.out.println("** Not Found after node to be inserted **");
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			System.out.println("  Head is null ");
			this.head = newNode;
			return;
		}
		Node temp = this.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println("** node inserted at the last **");
		temp.next = newNode;
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void print() {
		if(head==null){
			System.out.println("Linked List is Empty !!!");
			return ;
		}
		System.out.println(" ----- Linked List ----- ");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "   ");
			temp = temp.next;
		}
	}

	public void deleteMiddleData(int data) {
		if (this.head == null) {
			System.out.println("  Head is null ");
		}
		Node temp = this.head;
		Node prev = this.head;
		while (temp != null) {
			if (temp.data == data) {
				System.out.println("  Found data to be deleted ");
				prev.next = temp.next;
			}
			prev = temp;
			temp = temp.next;

		}
		System.out.println("** Not Found delete data **");
	}

	public void deleteMiddleUsingPosition(int pos) {// change it to
		// position
		if (this.head == null) {
			System.out.println("  Head is null ");
			return;
		}
		Node temp = this.head;
		Node prev = this.head;
		int count = 0;
		while (temp != null) {
			count++;
			if (count == pos) {
				System.out.println("  Found data to be deleted ");
				prev.next = temp.next;
			}
			prev = temp;
			temp = temp.next;

		}
		System.out.println("** Not Found delete data **");
	}

	public void deleteStart() {
		if (this.head == null) {
			System.out.println("------Head is null------");
			return ;
		}
		Node temp = this.head;
		this.head = temp.next;
		temp.next = null;
	}

	public void deleteEnd() {
		if (this.head == null) {
			System.out.println("------Head is null------");
			return ;
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

	public int length() {
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
	
	public boolean isDataPresent(int data) {
		if (this.head == null) {
			System.out.println(" head is null");
			return false;
		}
		Node temp = this.head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public Node getDataNode (int data) {
		if (this.head == null) {
			System.out.println(" head is null");
			return null;
		}
		Node temp = this.head;
		if (temp.data == data){
			return this.head;
		}
		
		while (temp.next != null) {
			if (temp.next.data == data) {
				return temp.next;
			}
			temp = temp.next;
		}
		return null;
	}
}

