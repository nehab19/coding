package guru.springframework.spring5webapp.linkedlist;

import org.springframework.boot.actuate.endpoint.web.Link;

public class FoldLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedListClass {
        Node head;
        Node tail;
        int size;

        void addLast(int data) {
            Node newNode = new Node();
            if (size == 0) {
                newNode.data = data;
                newNode.next = null;
                head = tail = newNode;
                size++;
            } else {
                newNode.data = data;
                newNode.next = null;
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node left;

        private void foldHelper(Node right, int floor) {
            if (right == null) {
                return;
            }
            foldHelper(right.next, floor + 1);
            if (floor > size / 2) {
                Node temp = left.next;
                left.next = right;
                right.next = temp;
                left = temp;
            } else if (floor == size / 2) {
                tail = right;
                tail.next = null;
            }
        }
        public void fold() {
            left=head;
            foldHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        list.fold();
        list.display();
    }
}
