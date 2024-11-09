package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderLinewiseZigZag {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traverseZigZag(Node node) {
        Stack<Node> mainStack = new Stack<>();
        mainStack.add(node);
        Stack<Node> childStack = new Stack<>();
        int level = 1;

        while (mainStack.size() > 0) {
            node = mainStack.pop();
            System.out.println(node.data + "");

            //odd
            if (level % 2 == 1) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    childStack.push(child);
                }
            }
            //even
            else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    childStack.push(child);
                }

            }
            if (mainStack.size() == 0) {
                mainStack = childStack;
                childStack = new Stack<>();
                level++;
                System.out.println();
            }

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
        traverseZigZag(root);
    }
}
