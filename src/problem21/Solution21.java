package problem21;

public class Solution21 {
	static class ListNode {
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

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode();
		ListNode temp = result;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}

		if (list1 == null) {
			temp.next = list2;
		} else {
			temp.next = list1;
		}

		return result.next;
	}

	public static void printAnswer() {
		// ListNode list2 = null;
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode result = mergeTwoLists(list1, list2);
		String resultListNode = "";
		while (result != null) {
			resultListNode += result.val + " ";
			result = result.next;
		}
		resultListNode = resultListNode.substring(0, resultListNode.length() - 1);
		System.out.println(resultListNode);
	}

	public static void run() {
		printAnswer();
	}
}
