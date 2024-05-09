package LinkedList;

import java.util.Scanner;

public class FindNodeInLL {
	
	public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
		int count = -1;
		Node<Integer> temp = head;
		while(temp != null) {
			
			if(temp.data == n) {
				return count;
			}
			temp = temp.next;
			count += 1;
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
		
		Node<Integer> head = takeInput();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int head1 =  findNodeRec(head,n);
		System.out.print(head1);

	}

}
