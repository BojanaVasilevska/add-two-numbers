
public class AddTwoNumbersWithWhile {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		if (carry > 0) {
			curr.next = new ListNode(carry);
		}

		return dummy.next;

	}
	
	public static void main(String[] args) {
	    AddTwoNumbersWithWhile addTwoNumbersWithWhile = new AddTwoNumbersWithWhile();

	    // Create the input linked lists
	    AddTwoNumbersWithWhile.ListNode l1 = addTwoNumbersWithWhile.new ListNode(2);
	    l1.next = addTwoNumbersWithWhile.new ListNode(4);
	    l1.next.next = addTwoNumbersWithWhile.new ListNode(3);

	    AddTwoNumbersWithWhile.ListNode l2 = addTwoNumbersWithWhile.new ListNode(5);
	    l2.next = addTwoNumbersWithWhile.new ListNode(6);
	    l2.next.next = addTwoNumbersWithWhile.new ListNode(4);

	    // Call the addTwoNumbers method
	    AddTwoNumbersWithWhile.ListNode result = addTwoNumbersWithWhile.addTwoNumbers(l1, l2);

	    // Print the result
	    while (result != null) {
	        System.out.print(result.val + " ");
	        result = result.next;
	    }
	}

}
