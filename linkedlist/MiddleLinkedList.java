package guru.springframework.spring5webapp.linkedlist;


class NodeList {
    int data;
    NodeList next;

    NodeList(int new_data) {
        data = new_data;
        next = null;
    }
}
public class MiddleLinkedList {
    public NodeList middleNode(NodeList head){
        NodeList slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
