package LinkedList;

import java.util.Scanner;

public class RecursvieReverseLL {
	

	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
		//Your code goes here
		
		if(head == null || head.next == null) 
		{ 
			return  head;
		}
		
		Node<Integer> reverseHead =  reverseLinkedListRec(head.next);
		Node<Integer> reverseTail = head.next;
		reverseTail.next = head;
		head.next = null;
		
		
		return reverseHead;
		
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
		Node<Integer> head1 =  reverseLinkedListRec(head);
		
		while (head1.next != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
	}

}
