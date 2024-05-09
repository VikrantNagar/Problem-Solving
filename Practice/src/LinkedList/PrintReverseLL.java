package LinkedList;

import java.util.Scanner;

public class PrintReverseLL {
	

	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		
		if(root == null) { return ;}
			 printReverse(root.next);
			System.out.print(root.data + " ");
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

		Node<Integer> head = takeInput();
		printReverse(head);
//		
//		while (head1.next != null) {
//			System.out.print(head1.data + " ");
//			head1 = head1.next;
//		}
	}

}
