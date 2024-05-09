package LinkedList;

import java.util.Scanner;

public class MergeSortUsingLL {
	
	public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
		
		if(head == null || head.next == null ) {
			return head;
		}
		
		Node<Integer> start = head;
		Node<Integer> Mid = head;
		
		while(Mid.next != null && Mid.next.next != null) {
			start = start.next;
			Mid = Mid.next.next;
			return start;
		}
		return start;
		
    }
	
	public static Node<Integer> sortedMerge(Node<Integer> a, Node<Integer> b)
    {
        Node<Integer> result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
 
	
	
	
	public static Node<Integer> mergeSortLinkedLists(Node<Integer> head) {
	
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> middle = midPoint(head);
		Node<Integer> nextOfMiddle = middle.next;
		
		middle.next = null;
		
		Node<Integer> left = mergeSortLinkedLists(head);
		Node<Integer> right = mergeSortLinkedLists(head);
		
		Node<Integer> sortedList = sortedMerge(left, right);
		return sortedList;
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
		Node<Integer> mid = midPoint(head1);
//		
//		while (mid.next != null) {
//			System.out.print(mid.data + " ");
//			mid = mid.next;
//		}
//		System.out.println();
//		
//		while (head1.next != null) {
//			System.out.print(head1.data + " ");
//			head1 = head1.next;
//		}
		
		Node<Integer> mergedLL = mergeSortLinkedLists(head1);

		while (mergedLL.next != null) {
			System.out.print(mergedLL.data + " ");
			mergedLL = mergedLL.next;
		}

}

}
