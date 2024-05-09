package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedLL {
	
	public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
		
		Node<Integer> tempHead = null;
		Node<Integer> tail = null;
		Node<Integer> t1 = head1;
		Node<Integer> t2 = head2;
		
		if(head1 == null ) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		if(t1.data<=t2.data)
        {
            tempHead=t1;
            tail=t1;
            t1=t1.next;
        }
        else
        {
            tempHead=t2;
            tail=t2;
            t2=t2.next;
        }
		
		
		while(t1!=null && t2!=null)
        {
            if(t1.data <= t2.data)
            {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
		
		if(t1==null)
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
		
	return tempHead;
		
		
		
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

		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> mergedLL = mergeTwoSortedLinkedLists(head1, head2);

		while (mergedLL.next != null) {
			System.out.print(mergedLL.data + " ");
			mergedLL = mergedLL.next;
		}

}
}