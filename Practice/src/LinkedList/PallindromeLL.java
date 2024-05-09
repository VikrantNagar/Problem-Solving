package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class PallindromeLL {
	
	static Node<Integer> reverseList(Node<Integer> head) {
        Node<Integer> previous = null;
        Node<Integer> next = null;

        // traversing the list till the end.
        while (head != null) {
            // making a pointer point to the next node of the current node.
            next = head.next;
            head.next = previous;

            // making the previous node point to the current node.
            previous = head;

            // moving the current node.
            head = next;
        }
        return previous;
    }
	
	
	static boolean checkPalindrome(Node<Integer> head) {
        // base case.
        if (head == null)
            return true;

        Node<Integer> first = head;
        // defining an array that will store the elements of the linked list.
        ArrayList<Integer> a = new ArrayList<>();
        // traversing the list and storing the elements.
        while (first != null) {
            a.add((Integer) first.data);
            first = first.next;
        }

        // first pointer will now point to the head of the reversed list.
        first = reverseList(head);
        int i = 0;
        // traversing both the list and array and checking each node.
        while (first != null)  {
            if (first.data != a.get(i))
                return false;

            first = first.next;
            i += 1;
        }
        return true;
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
		
//		Scanner s = new Scanner(System.in);

//		int pos = s.nextInt();
		//int d = s.nextInt();

		Node<Integer> head = takeInput();
		System.out.print(checkPalindrome(head));
		 
//		 Node<Integer> head1 = reverseLL(head);
//		 while(head1 != null) {
//			 System.out.print(head1.data + " ");
//			 head1 = head1.next;
//		 }

	}

}
