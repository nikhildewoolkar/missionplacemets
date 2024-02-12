public class ll {

    public class Node {
        String data;
        Node next;
        

        Node(String data) {
            this.data = data;
            this.next = null;
        }
        
    }
    // add - first and last
    public void addFirst(String data){
        Node head = null;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("a");
        list.addFirst("is");

    }
   
}
