package problem142;

import java.util.HashSet;
import java.util.Set;

import model.ListNode;

public class Solution142 {
	public static ListNode detectCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();

		while(head != null){
			if(!set.add(head)){
				return head;
			}
			head = head.next;
		}
		return null;
	}

	public static void printAnswer() {
		// ListNode list2 = null;
		ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-1))));
		ListNode result = detectCycle(head);

		while (result != null) {

			System.out.println(result.val);
			result = result.next;
		}

	}

	public static void run() {
		printAnswer();
	}
}
