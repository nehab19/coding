package guru.springframework.spring5webapp.linkedlist;

public class MergeLinkedList {
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

        public static int addTwoListHelper(Node one, Node two, int pv1, int pv2, LinkedListClass result) {
            int add = 0;
            if (one == null && two == null) {
                return 0;
            } else {
                if (pv1 > pv2) {
                    int oldCarry = addTwoListHelper(one.next, two, pv1 - 1, pv2, result);
                    add = one.data + oldCarry;
                } else if (pv2 > pv1) {
                    int oldCarry = addTwoListHelper(one, two.next, pv1, pv2 - 1, result);
                    add = two.data + oldCarry;
                } else {
                    int oldCarry = addTwoListHelper(one.next, two.next, pv1 - 1, pv2 - 1, result);
                    add = one.data + two.data + oldCarry;
                }
                int value = add % 10;
                int carry = add / 10;
                result.addFirst(value);
                return carry;

            }
        }

        public static LinkedListClass addTwoLinkedList(LinkedListClass one, LinkedListClass two) {
            LinkedListClass result = new LinkedListClass();
            int oldCarry = addTwoListHelper(one.head, two.head, one.size, two.size, result);
            if (oldCarry > 0) {
                result.addFirst(oldCarry);
            }
            return result;
        }

    }

    public static void main(String[] args) {
        LinkedListClass linkedListClass1 = new LinkedListClass();
        LinkedListClass linkedListClass2 = new LinkedListClass();
        linkedListClass1.addLast(9);
        linkedListClass1.addLast(8);
        linkedListClass2.addLast(5);
        LinkedListClass result = LinkedListClass.addTwoLinkedList(linkedListClass1, linkedListClass2);
        result.display();
        linkedListClass1.display();
        linkedListClass2.display();
    }

}
