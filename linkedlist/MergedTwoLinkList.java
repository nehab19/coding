package guru.springframework.spring5webapp.linkedlist;

class NodeClass {
    int data;
    NodeClass next;

    NodeClass(int data, NodeClass next) {
        this.data = data;
        this.next = next;
    }

    NodeClass(int data) {
        this.data = data;
    }
}

// Class to merge two sorted linked lists
public class MergedTwoLinkList {

    // Function to merge two sorted linked lists
    static NodeClass sortTwoLinkedLists(NodeClass list1, NodeClass list2) {
        NodeClass dummyNode = new NodeClass(-1);
        NodeClass temp = dummyNode;

        while (list1 != null && list2 != null) {
            if(list1.data<= list2.data){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }else if(list2!=null){
            temp.next=list2;
        }
        return dummyNode.next;
    }

    // Function to print the linked list
    static void printLinkedList(NodeClass head) {
        NodeClass temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example Linked Lists
        NodeClass list1 = new NodeClass(1);
        list1.next = new NodeClass(3);
        list1.next.next = new NodeClass(5);

        NodeClass list2 = new NodeClass(2);
        list2.next = new NodeClass(4);
        list2.next.next = new NodeClass(6);

        NodeClass mergedList = sortTwoLinkedLists(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}

