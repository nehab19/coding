package guru.springframework.spring5webapp.trees;

import java.util.*;

public class LevelOrderTraversal {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traverse(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node=queue.remove();
            System.out.print(node.data + " ");
            for(Node children: node.children){
                queue.add(children);
            }
        }
}
    public static void main(String[] args) {
        int[] array = {10, 20, 40, -1, -1, 30, -1, -1};
        Node root = null;
        Stack<Node> stack=new Stack<>();
        for(int i=0;i<array.length;i++){
            if(array[i]==-1){
               stack.pop();
            }else{
                Node node=new Node();
                node.data=array[i];
                if(!stack.isEmpty()){
                    stack.peek().children.add(node);
                }else{
                   root=node;
                }
                stack.push(node);
            }
        }
        traverse(root);
    }
}
