package LinkedList;

import java.util.Scanner;

public class DeleteNodeLL {
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
		if(pos == 0) {
			head = head.next;
			return head;
		}else {
			int i = 0;
			Node<Integer> temp = head;
			// for(int i=0; i<pos-1 ; i++)
			while (i < pos-1 && temp != null) {
				i++;
				temp = temp.next;
			}
			if(temp != null && temp.next !=null) {
				temp.next = temp.next.next;
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
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		int pos = s.nextInt();
		//int d = s.nextInt();

		Node<Integer> head = takeInput();
		Node<Integer> head1 = deleteNode(head, pos);

		while (head1.next != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}

	}

}
