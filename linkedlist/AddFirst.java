package guru.springframework.spring5webapp.linkedlist;

public class AddFirst {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedListClass {
        Node head;
        Node tail;
        int size;

        public void addFirst(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = head;
            head = newNode;
            size++;
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
        LinkedListClass linkedList=new LinkedListClass();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.display();
    }
}
