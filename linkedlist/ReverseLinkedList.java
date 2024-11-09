package guru.springframework.spring5webapp.linkedlist;

public class ReverseLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedListClass {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            if (size == 0) {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "");
                temp = temp.next;
            }
            System.out.println();
        }

        Node left;

        public Node reverseHelper(Node right, int floor) {
            if (right == null) {
                return null;
            }
            reverseHelper(right.next, floor + 1);
            System.out.println(right.data);
            //swapping

            if (floor >= size / 2) {
                int temp = right.data;
                right.data = left.data;
                left.data = temp;
                left = left.next;
            }
            return right;
        }

        public void reverse() {
            left = head;
            reverseHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        LinkedListClass linkedList=new LinkedListClass();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.display();

    }
}
