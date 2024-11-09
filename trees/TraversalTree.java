package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class TraversalTree {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void traverse(Node node) {
        //euler left -> node pre area
        System.out.println("Node pre " + node.data);
        for (Node child : node.children) {
            //edge pre area
            System.out.println("Edge pre " + node.data + "--" + child.data);
            traverse(child);
            //edge post area
            System.out.println("Edge post " + node.data + "--" + child.data);
        }
        //euler right -> node post area
        System.out.println("Node post " + node.data);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1, -1};
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
        traverse(root);
    }
}
