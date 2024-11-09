package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class FindElementInTree {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static boolean findElement(Node node, int data) {
        if (node.data == data) {
            return true;
        }
        for (Node child : node.children) {
            boolean firstChild = findElement(child, data);
            if (firstChild) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1, 50, 60, -1, 70, -1, -1, -1};
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
        System.out.println("Element found in tree : " +findElement(root,50));
    }
}
