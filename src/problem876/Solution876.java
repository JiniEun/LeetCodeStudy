package problem876;

import model.ListNode;

public class Solution876 {

	public static ListNode middleNode(ListNode head) {

		// 현재 ListNode의 길이를 구하고, 가운데 노드를 반환한다
		ListNode currentNode = head;
		int len = 0;

		while (currentNode != null) {
			len++;
			currentNode = currentNode.next;
		}

		currentNode = head;

		int mid = len / 2;

		for (int i = 0; i < mid; i++) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	public static void printAnswer() {
		// ListNode list2 = null;
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode result = middleNode(head);
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
