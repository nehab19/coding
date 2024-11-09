package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class MaximumNode {

    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void display(Node node) {
        StringBuilder str = new StringBuilder(node.data + "->");
        for (Node children : node.children) {
            str.append(children.data).append(" , ");
        }
        str.append(".");
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

    static int max(Node node) {
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int cm = max(child);
            max = Math.max(cm, max);
        }
        /** to compare the actual node with child node **/
        max = Math.max(node.data, max);
        return max;
    }

    public static void main(String[] args) {
        int[] array = {10, 20,40,-1,-1,30,-1,-1};
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                stack.pop();
            } else {
                Node node = new Node();
                node.data = array[i];
                if (!stack.isEmpty()) {
                    stack.peek().children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);
            }
        }
        System.out.println("Maximum node at tree is : " +max(root));
    }
}
