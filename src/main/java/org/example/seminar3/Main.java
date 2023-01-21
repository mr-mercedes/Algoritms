package org.example.seminar3;


import java.util.Iterator;

public class Main {

    /**
     * [1 -> 2 -> 4] = a
     * [1 -> 3 -> 4] = b
     * -------------
     * [1 -> 1 -> 2 -> 3 -> 4 -> 4] = merge(a, b)
     */
    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        ListNode b = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7))));

        ListNode result = merge(a, b);
//        System.out.println(result);


        // ListNode result
        // result.iterator()
        // public Iterator iterator() {
        //      ListNode node = this;
        //      return new ListNodeIterator(node);
        // }
        Iterator<Integer> resultIterator = result.iterator();
        while (resultIterator.hasNext()) {
            Integer value = resultIterator.next();
            System.out.println(value);
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    /**
     * 1 -> 1 -> 1 -> 1 -> null
     * 1 -> 3 -> 5 -> 7
     * <p>
     * 1 -> 1 -> 1 -> 1 -> 1 -> 3 -> 5 -> 7
     */
    static ListNode merge(ListNode a, ListNode b) {
        ListNode head = null;
        ListNode iterator = null;
        while (a != null || b != null) {
            int min = -1;

            if (a == null) {
                min = b.val;
                b = b.next;
            } else if (b == null) {
                min = a.val;
                a = a.next;
            } else if (a.val == b.val || a.val < b.val) {
                // берем любом (а)
                min = a.val;
                a = a.next;
            } else { // a.val > b.val
                // берем b и двигаем его вперед
                min = b.val;
                b = b.next;
            }


            // head -> toAppend1 -> toAppend2 -> toAppend3
            // iterator = toAppend3

            ListNode toAppend = new ListNode(min);
            if (head == null) {
                head = toAppend;
                iterator = head;
            } else {
                iterator.next = toAppend;
                iterator = iterator.next;
            }
        }

        return head;
    }

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

        @Override
        public Iterator<Integer> iterator() {
            //   1 -> 2 -> 3 -> 4 -> 5
            ListNode node = this;
            return new ListNodeIterator(node);

//            return new Iterator<Integer>() {
//                @Override
//                public boolean hasNext() {
//                    return false;
//                }
//
//                @Override
//                public Integer next() {
//                    next = ListNode.this.next.next;
//                    return null;
//                }
//            };
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

            @Override
            public void remove() {
                // TODO: 19.01.2023
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("[");

            ListNode iterator = this;
            while (iterator != null) {
                builder.append(iterator.val).append(" -> ");
                iterator = iterator.next;
            }

            builder.append("]");

            return builder.toString();
        }
    }

}
