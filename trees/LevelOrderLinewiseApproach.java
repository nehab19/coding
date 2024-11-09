package guru.springframework.spring5webapp.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderLinewiseApproach {
    static class Node {
        int data;
        Queue<Node> children = new ArrayDeque<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void traverse(Node node) {
        Queue<Node> mainQueue = new ArrayDeque<>();
        mainQueue.add(node);
        mainQueue.add(new Node(-1));

        while (!mainQueue.isEmpty()) {
            node = mainQueue.remove();
            if (node.data != -1) {
                System.out.print(node.data + " ");
                for (Node child : node.children) {
                    mainQueue.add(child);
                }
            } else {
                if (!mainQueue.isEmpty()) {
                    mainQueue.add(new Node(-1));
                    System.out.println();
                }
            }
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
                Node node = new Node(array[i]);
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

