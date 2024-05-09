package LinkedList;

import java.util.Scanner;

public class AppendLastNtoFirstLL {
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		
		if(head == null || n==0) {
			return head;
		} 
		int count = 0;
		Node<Integer> demoNode = head;
		
		while(demoNode !=null) {
			
			count++;
			demoNode = demoNode.next;
			
		}
		
		int lenght = count;
		Node<Integer> temp = head;
		Node<Integer> temp2 = head;
		int i=0;
		while(i < lenght-n-1 && temp !=null) {
			//i++;
			temp = temp.next;
			i++;
		}
		head = temp.next;
		temp.next = null;
		Node<Integer> tempHead=head;
		
		while(tempHead.next!=null)
		{
			tempHead=tempHead.next;
		}
		tempHead.next=temp2;
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

		int n = s.nextInt();
		

		Node<Integer> head = takeInput();
		Node<Integer> head1 = appendLastNToFirst(head, n);
		
		while (head1.next != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
	}

}
