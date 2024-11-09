package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class SizeGenericTree {
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

    public static int size(Node node) {
        int size = 0;
        for (Node child : node.children) {
            int cs = size(child);
            size = size + cs;
        }
        size = size + 1;
        return size;
    }


    public static void main(String[] args) {
        int[] array = {10, 20,-1,30,50,-1,60,-1,-1,40,-1,-1};
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
       // display(root);
        System.out.println("Size of tree is : "+size(root));
    }
}
