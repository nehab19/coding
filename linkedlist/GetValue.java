package guru.springframework.spring5webapp.linkedlist;

public class GetValue {
    public static class Node {
        Node next;
        int data;
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

        public void display() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println("data: " + currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println();
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getIndexData(int index) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (index < 0 || index >= size) {
                System.out.println("Invalid index");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public static void main(String[] args) {
            LinkedListClass linkedList = new LinkedListClass();
            linkedList.addLast(1);
            linkedList.addLast(2);
            linkedList.addLast(3);
            linkedList.addLast(4);
            System.out.println("First element : " +linkedList.getFirst());
            System.out.println("Last Element : " + linkedList.getLast());
            System.out.println("Element at particular index : " +linkedList.getIndexData(2));
        }
    }
}
