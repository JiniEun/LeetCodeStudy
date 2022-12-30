package problem206;

import model.ListNode;

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        ListNode node = null;
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }
        return node;
    }

    public static void printAnswer() {
        // ListNode list2 = null;
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = reverseList(head);
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
