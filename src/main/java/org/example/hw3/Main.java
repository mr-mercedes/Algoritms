package org.example.hw3;

public class Main {
    public static void main(String[] args) {
        ListNode.ListNodeUtils l = new ListNode.ListNodeUtils();
        for (int i = 0; i <= 10; i++) {
            l.addFirst(i);
        }
        System.out.println(l);
        l.addFirst(100);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.reverseList();
        System.out.println(l);
    }
}
