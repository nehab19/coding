package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class LinearisedApproachSecond {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }

    static Node lineariseTree(Node node) {
        if (node.children.isEmpty()) {
            return node;
        }
        Node lastNodeTail = lineariseTree(node.children.get(node.children.size() - 1));

        while (node.children.size() > 1) {
            Node last = node.children.remove(node.children.size() - 1);
            Node secondLast = node.children.get(node.children.size() - 1);
            Node secondLastTail = lineariseTree(secondLast);
            secondLastTail.children.add(last);
        }
        return lastNodeTail;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1,50,60,-1,70,-1, -1,-1};
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
        display(root);
        lineariseTree(root);
        display(root);
    }
}
