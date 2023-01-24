package org.example.hw4;

import java.util.*;

public class Homework {
    public static class Tree<T extends Comparable<T>> {
        private Node root;

        private class Node {
            private final T value;
            private Node left;
            private Node right;

            public Node(T value) {
                this.value = value;
            }
        }

        public void add(T value) {
            Objects.requireNonNull(value);
            root = appendNode(root, value);
        }

        private Node appendNode(Node current, T value) {
            if (current == null) {
                return new Node(value);
            }

            int compare = value.compareTo(current.value);
            if (compare < 0) {
                current.left = appendNode(current.left, value);
            } else if (compare > 0) {
                current.right = appendNode(current.right, value);
            }

            return current;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tree<?> tree = (Tree<?>) o;
            return Objects.equals(root, tree.root);
        }

        @Override
        public int hashCode() {
            return Objects.hash(root);
        }

        public boolean contains(T value) {
            if (value != null){
                return bfs(value) != null;
            }else {
                throw new NullPointerException();
            }
        }
        private Node bfs(T value){
            Node node = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){
                Node next = queue.poll();
                if (next.value.equals(node.value)){
                    return node;
                }
                if (next.left != null){
                    queue.add(next.left);
                }
                if (next.right != null){
                    queue.add(next.right);
                }

            }
            return null;
        }
    }
}
