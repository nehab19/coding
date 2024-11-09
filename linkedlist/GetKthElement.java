package guru.springframework.spring5webapp.linkedlist;

public class GetKthElement {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedListClass {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node newNode = new Node();
            if (size == 0) {
                newNode.data = val;
                newNode.next = null;
                head = tail = newNode;
                size++;
            } else {
                newNode.data = val;
                newNode.next = null;
                tail.next = newNode;
                tail = newNode;
                size++;
            }

        }

        int getKth(int position) {
            Node slowPointer = head;
            Node fastPointer = head;
            for (int i = 0; i < position; i++) {
                fastPointer = fastPointer.next;
            }
            while (fastPointer != tail) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            return slowPointer.data;
        }

        public void display() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println("data: " + currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListClass linkedList = new LinkedListClass();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        System.out.println("The Kth element is : " + linkedList.getKth(3));
    }
}
