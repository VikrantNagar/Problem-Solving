package LinkedList;

import java.util.Scanner;

public class FindNodeLL {
	
	public static int findNode(Node<Integer> head, int n) {
		
		int count = 0;
		Node<Integer> temp = head;
		while(temp !=null) {
			//count++;
			if(temp.data == n) {
				return count;
			}
			count++;
			temp = temp.next;
		}
		return -1;
		
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

		int n = s.nextInt();
		//int d = s.nextInt();

		Node<Integer> head = takeInput();
		System.out.print(findNode(head, n));
	}

}
