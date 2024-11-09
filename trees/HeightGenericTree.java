package guru.springframework.spring5webapp.trees;

import java.util.ArrayList;
import java.util.Stack;

public class HeightGenericTree {
    static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    static int height(Node node){
        /**because if its single node the it should be 0 if given 0 then out of loop its adding 1 it would result in one which is wrong **/
        int height=-1;
        for(Node child:node.children){
            int ch=height(child);
            height=Math.max(ch,height);
        }
        height=height+1;
        return height;
    }

    public static void main(String[] args) {
        HeightGenericTree heightGenericTree=new HeightGenericTree();
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
        height(root);
        System.out.println("Height of tree is : "+height(root));
    }

}
