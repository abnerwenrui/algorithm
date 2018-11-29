package com.abner.leetcode;

/**
 * @author peiwenrui
 * @since 2018-10-15 13:39
 */
public class ReverseList {



    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode node = head;
        for (int i = 1; i < 10; i++) {
            node.setNext(new ListNode(i));
            node = node.getNext();
        }

        ListNode reverseList2 = reverseList(head);

        System.out.println(reverseList2);


    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //反转的头节点
        ListNode reverseHead = null;
        // 指针1：当前节点
        ListNode currentNode = head;
        // 指针2：当前节点的前一个节点
        ListNode prevNode = null;
        while (currentNode != null) {
            // 指针3：当前节点的后一个节点
            ListNode nextNode = currentNode.getNext();
            if (nextNode == null) {
                reverseHead = currentNode;
            }
            // 将当前节点的后一个节点指向前一个节点
            currentNode.setNext(prevNode);
            // 将前一个节点指向当前节点
            prevNode = currentNode;
            // 将当前节点指向后一个节点
            currentNode = nextNode;
        }
        return reverseHead;
    }

    static class ListNode {
        private int value;
        private ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

}
