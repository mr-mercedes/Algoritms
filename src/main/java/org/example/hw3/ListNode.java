package org.example.hw3;


import java.util.Iterator;

public class ListNode implements Iterable<Integer> {
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

    public static class ListNodeUtils {
        private ListNode head;
        private ListNode tail;

        public void addFirst(int value) {
            ListNode a = new ListNode();
            a.val = value;
            if (head == null) {
                head = a;
            } else {
                a.next = head;
                head = a;
            }
        }

        public void removeFirst() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
        }
        public void reverseList(){
            ListNode reversedPart = null;
            ListNode current = head;
            while (current != null){
                ListNode next = current.next;
                current.next = reversedPart;
                reversedPart = current;
                current = next;
            }
            head = reversedPart;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode iterator = this.head;
            while (iterator != null) {
                sb.append(iterator.val).append(" ");
                iterator = iterator.next;
            }
            return sb.toString();
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        ListNode node = this;
        return new ListNode.ListNodeIterator(node);
    }

    private static class ListNodeIterator implements Iterator<Integer> {
        private ListNode node;

        public ListNodeIterator(ListNode node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int toReturn = node.val;
            node = node.next;
            return toReturn;
        }
    }
}

