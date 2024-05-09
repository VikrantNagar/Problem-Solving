import java.util.Scanner;

public class RemoveDuplicatedFromLL {
	
	public static void removeDuplicates(Node<Integer> head) {
		
		Node<Integer> temp = head;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else
			{
				tail.next = currentNode;
				tail = currentNode;
			}
			data = s.nextInt();
			
		}
		removeDuplicates(head);

	}

}
