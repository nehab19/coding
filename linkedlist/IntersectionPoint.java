package guru.springframework.spring5webapp.linkedlist;

public class IntersectionPoint {

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

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "");
                temp = temp.next;
            }
            System.out.println();

        }

        public void addFirst(int val) {
            if (size == 0) {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = head;
                head = temp;
                size++;
            }
        }

        public static int findIntersectionPoint(LinkedListClass one, LinkedListClass two) {
            Node t1 = one.head;
            Node t2 = two.head;

            int delta = Math.abs(one.size - two.size);

            if (one.size > two.size) {
                for (int i = 0; i < delta; i++) {
                    t1 = t1.next;
                }
            } else {
                for (int i = 0; i < delta; i++) {
                    t2 = t2.next;
                }
            }

            while (t1.data != t2.data) {
                t1 = t1.next;
                t2 = t2.next;
            }
            return t1.data;
        }

        public static void main(String[] args) {
            LinkedListClass linkedListClass1 = new LinkedListClass();
            LinkedListClass linkedListClass2 = new LinkedListClass();
            linkedListClass1.addLast(0);
            linkedListClass1.addLast(1);
            linkedListClass1.addLast(2);
            linkedListClass1.addLast(3);
            linkedListClass1.addLast(4);
            linkedListClass1.addLast(5);
            linkedListClass1.addLast(6);
            linkedListClass2.addLast(9);
            linkedListClass2.addLast(8);
            linkedListClass2.addLast(4);
            linkedListClass2.addLast(5);
            linkedListClass2.addLast(6);
            linkedListClass1.display();
            linkedListClass2.display();
            int result = LinkedListClass.findIntersectionPoint(linkedListClass1, linkedListClass2);
            System.out.println("The intersection point is : {} " + result);

        }

    }
}
