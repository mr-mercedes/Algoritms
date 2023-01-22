Дан класс
```java
public static class ListNode implements Iterable<Integer> {
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
```

1. Реализовать методы addFirst, removeFirst.
```java
public class ListNodeUtils {
    
    public static ListNode addFirst(int value) {
        // TODO: 19.01.2023  
    }
    
    public static ListNode removeFirst(ListNode node) {
        // TODO: 19.01.2023  
    }
}
```

2. Реализовать методы разворота связного списка.
```java
public class ListNodeUtils {
    public static ListNode reverse(ListNode node) {
        // TODO: 19.01.2023  
    }
}
```