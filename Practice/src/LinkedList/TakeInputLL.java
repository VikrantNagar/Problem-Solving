package LinkedList;

import java.util.Scanner;

public class TakeInputLL {
	
	public static Node<Integer> takeInput(){
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while(data !=-1) {
		Node<Integer> currentNode = new Node<Integer>(data);
		if(head == null) {
			
			head = currentNode;
			tail = currentNode;
		}else {
			tail.next = currentNode;
			tail = tail.next; //or tail = currentNode;
			
		}
	
		data = s.nextInt();
	}
		return head;
	}
	

}
