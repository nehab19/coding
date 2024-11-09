package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class NodeToRoot {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static ArrayList<Integer> getNodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        for (Node child : node.children) {
            ArrayList<Integer> childList = getNodeToRootPath(child, data);
            if (!childList.isEmpty()) {
                childList.add(node.data);
                return childList;
            }
        }
        return new ArrayList<>();
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
        System.out.println("Node to root path : " + getNodeToRootPath(root, 60));
    }
}

