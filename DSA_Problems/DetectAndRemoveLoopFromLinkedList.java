package DSA_Problems;

public class DetectAndRemoveLoopFromLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        DetectAndRemoveLoopFromLinkedList llist = new DetectAndRemoveLoopFromLinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;
        llist.detectAndRemoveLoop();
        System.out.println("Linked List after removing loop : ");
        llist.printList(head);
    }
    
    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    void detectAndRemoveLoop(){
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                removeLoop(slow);
                return;
            }
        }
    }

    void removeLoop(Node loopNode){
        Node ptr1 = loopNode;
        Node ptr2 = loopNode;
        int k = 1;
        while(ptr1.next != ptr2){
            ptr1 = ptr1.next;
            k++;
        }
        ptr1 = head;
        ptr2 = head;
        for(int i = 0; i < k; i++){
            ptr2 = ptr2.next;
        }
        while(ptr2 != ptr1){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        while(ptr2.next != ptr1){
            ptr2 = ptr2.next;
        }
        ptr2.next = null;
    }
}
