package guru.springframework.spring5webapp.trees;


import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeConstructor {
    /**
     * it is an inner class and it requires an outer class object to access the inner class variables so it needs to be static
     * as static nested class (often called a static inner class) does not have access to the instance variables and methods of the outer class.
     **/
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + " , ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }

    }


    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1};
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                stack.pop();
            } else {
                Node t = new Node();
                t.data = array[i];
                if (!stack.isEmpty()) {
                    stack.peek().children.add(t);
                } else {
                    root = t;
                }
                stack.push(t);
            }
        }
        display(root);
    }
}
