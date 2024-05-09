package LinkedList;

import java.util.Scanner;

public class MidOfLL {
	
	
	public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
		
		if(head == null || head.next == null ) {
			return head;
		}
		if(head.next.next == null) {
			return head;
		}
		
		
		Node<Integer> start = head;
		Node<Integer> Mid = head;
		Node<Integer> temp = head;
		
		while(temp != null) {
			start = start.next;
			Mid = Mid.next.next;
			
			if(Mid.next == null || Mid.next.next == null) {
				return start;
			}
			temp = temp.next;
		}
		return start;
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
		Node<Integer> head1 =  midPoint(head);
		
		System.out.print(head1.data);
//		while (head1.next != null) {
//			System.out.print(head1.data + " ");
//			head1 = head1.next;
//		}
	}

}
