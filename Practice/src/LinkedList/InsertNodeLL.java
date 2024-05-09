package LinkedList;

import java.util.Scanner;

public class InsertNodeLL {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
		// Your code goes here

		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = null;
		if (head == null) {
			return head = newNode;
		} else if (pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		} else {
			int i = 0;
			Node<Integer> temp = head;
			// for(int i=0; i<pos-1 ; i++)
			while (i < pos - 1 && temp != null) {
				i++;
				temp = temp.next;
			}
			if (temp != null) {

				newNode.next = temp.next;
				temp.next = newNode;
				return head;
			}
		}
		return head;

	}

	public static Node<Integer> takeInput() {

		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if (head == null) {

				head = currentNode;
				tail = currentNode;
			} else {
				tail.next = currentNode;
				tail = tail.next; // or tail = currentNode;

			}

			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int pos = s.nextInt();
		int d = s.nextInt();

		Node<Integer> head = takeInput();
		Node<Integer> head1 = insert(head, pos, d);

		while (head1.next != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
	}
}
