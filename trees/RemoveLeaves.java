package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveLeaves {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }

    static void removesLeaves(Node node) {
        for (int i = node.children.size() - 1; i >= 0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(child);
            }
        }
        for (Node child : node.children) {
            removesLeaves(child);
        }
    }
    public static void main(String[] args) {
       int[] array = {10, 20, 40, -1, -1, 30, -1, -1};
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
        removesLeaves(root);
        display(root);
    }

}
