package LinkedList;

import java.util.Scanner;

public class LengthOfLinkedList {
	
	public static int length(Node<Integer> head){
		//Your code goes here
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null && temp.data >=0){
			count++;
			temp = temp.next;
		}
return count;

	}
	
	public static Node<Integer> takeInput(){
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
			}
			else {
				Node<Integer> tail = head;
				while(tail.next != null) {
				tail = tail.next;
			}
				tail.next = currentNode;
			}
			data = s.nextInt();
			
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.print(length(head));

	}

}
