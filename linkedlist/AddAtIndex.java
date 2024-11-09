package guru.springframework.spring5webapp.linkedlist;

public class AddAtIndex {
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
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                System.out.println("Invalid Arguments!");
            } else if (index == 0) {
                Node newNode = new Node();
                newNode.data = val;
                newNode.next = head;
                head = newNode;
                if (size == 0) {
                    tail = newNode;
                }
                size++;
            } else if(index == size) {
                Node newNode = new Node();
                if (size == 0) {
                    newNode.data = val;
                    head = tail = newNode;
                    size++;
                }else{
                   newNode.data = val;
                   newNode.next = null;
                   tail.next = newNode;
                   tail = newNode;
                   size++;
                }
            }else {
                Node newNode = new Node();
                newNode.data = val;
                Node temp=head;
                for (int i = 0; i < index-1; i++) {
                    temp=temp.next;
                }
                newNode.next = temp.next;
                temp.next=newNode;
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
    }

    public static void main(String[] args) {
        LinkedListClass linkedList = new LinkedListClass();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addAtIndex(2,10);
        linkedList.display();

    }
}
