package guru.springframework.spring5webapp.linkedlist;

public class RemoveFirst {
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
            if (size == 0){
                newNode.data = val;
                newNode.next = null;
                head=tail=newNode;
                size++;
            }else{
                newNode.data = val;
                newNode.next = null;
                tail.next = newNode;
                tail=newNode;
                size++;
            }

        }
        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty!");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head=head.next;
                size--;
            }
        }
        public void display(){
            Node currentNode=head;
            while (currentNode!=null){
                System.out.println("data: "+currentNode.data);
                currentNode=currentNode.next;
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
        linkedList.removeFirst();
        linkedList.display();
    }

}
