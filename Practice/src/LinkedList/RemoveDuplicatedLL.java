package LinkedList;

import java.util.Scanner;

public class RemoveDuplicatedLL {
	

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
//		if(head == null) {
//			return head;
//		}
//		if(head.next==null)
//            return head;
		
		Node<Integer> temp = head;
		Node<Integer> curr = head.next;
		Node<Integer> finalhead=head;
		while(curr != null) {
			
			if(temp.data.equals(curr.data)) {
				
				curr = curr.next;

			}else {
				temp.next = curr;
				temp = curr;
			//curr = curr.next;
			}
		}
		temp.next=null;
        return finalhead;
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
		Node<Integer> head1 = removeDuplicates(head);
		
		while (head1.next != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
	}

}
