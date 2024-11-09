package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class Pratice {
    static class NodeClass {
        int data;
        ArrayList<NodeClass> children = new ArrayList<>();

    }

    static boolean findElement(NodeClass node, int data) {
        if (node.data == data) {
            return true;
        }
        for (NodeClass child : node.children) {
            boolean findElement = findElement(child, data);
            if (findElement) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1, 50, 60, -1, 70, -1, -1, -1};
        NodeClass root = null;
        Stack<NodeClass> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                stack.pop();
            } else {
                NodeClass nodeClass = new NodeClass();
                nodeClass.data = array[i];
                if (!stack.empty()) {
                    stack.peek().children.add(nodeClass);
                } else {
                    root = nodeClass;
                }
                stack.push(nodeClass);
            }
        }
        System.out.println(findElement(root,70));
    }
}
