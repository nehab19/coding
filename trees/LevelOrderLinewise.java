package guru.springframework.spring5webapp.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderLinewise {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrderTraverse(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        Queue<Node> childQueue = new ArrayDeque<>();

        while (!queue.isEmpty()) {
            node = queue.remove();
            System.out.println(node.data + " ");

            for (Node child : node.children) {
                childQueue.add(child);
            }
            if (queue.isEmpty()) {
                queue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1};
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
        levelOrderTraverse(root);
    }
}
