package guru.springframework.spring5webapp.linkedlist;

public class Palindrome {
    public static class Node {
        String data;
        Node next;
    }

    public static class LinkedListClass {
        Node head;
        Node tail;
        int size;

        void addLast(String val) {
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

        public boolean palindromeHelper(Node right, int floor) {
            if (right == null) {
                return true;
            }
            boolean isPalindrome=palindromeHelper(right.next, floor + 1);
            if(false==isPalindrome) {
                return  false;
            }else if(right.data!=left.data){
                return false;
            }else{
                left=left.next;
                return true;
            }
        }

        public boolean isPalindrome() {
            left = head;
            return palindromeHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.addLast("n");
        list.addLast("i");
        list.addLast("t");
        list.addLast("a");
        list.addLast("n");
        list.display();
        boolean listPalindrome =list.isPalindrome();
        System.out.println("List is palindrome or not? " + listPalindrome);


    }
}
