package dsa;
class dsa{
int data;
dsa next;

dsa(int data){
this.data = data;
this.next = null;
}
}
 class linkedlist{
    private dsa head;

    public linkedlist(){
        this.head = null;
    
}

public void addatend(int data)
{
    dsa newnode = new dsa(data);
    if(head == null){
      head  = newnode;
      return;
}
dsa current = head;
while (current.next != null) {
    current = current.next;
}
current.next = newnode;
}
public void addatstart(int data){
    dsa newnode = new dsa(data);
    newnode.next = head;
    head = newnode; 

}
public void addAtPosition(int data, int position) {
    if (position < 0) {
        System.out.println("Invalid position");
        return;
    }
    if(position == 0){
        addatstart(data);
        return;
    }
    dsa newnode = new dsa(data);
    dsa current = head;
    int currentposition = 0;
    while(currentposition < position-1 && current!= null)
    {
        current = current.next;
        currentposition++;
    
    }
     if(current == null){
        System.out.println("Invalid");
        return;
     }
    newnode.next = current.next;
    current.next = newnode;

}
public void removeFromStart() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    head = head.next;
}
public void removeFromEnd() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    dsa current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
}
public void removeAtPosition(int position) {
    if (head == null || position < 0) {
        System.out.println("Invalid operation");
        return;
    }
    if (position == 0) {
        head = head.next;
        return;
    }
    dsa current = head;
    int currentPosition = 0;
    while (currentPosition < position - 1 && current != null) {
        current = current.next;
        currentPosition++;
    }
    if (current == null || current.next == null) {
        System.out.println("Invalid position");
        return;
    }
    current.next = current.next.next;
}
public int length() {
    int length = 0;
    dsa current = head;
    while (current != null) {
        length++;
        current = current.next;
    }
    return length;
}
public void printList() {
    dsa current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
public static void main(String[] args) {
    linkedlist list = new linkedlist();
    list.addatend(10);
    list.addatend(20);
    list.addatend(30);
    list.addatstart(5);
    list.addAtPosition(15, 2);

    System.out.println("Original list:");
    list.printList();

    list.removeFromStart();
    list.removeFromEnd();
    list.removeAtPosition(1);

    System.out.println("List after removals:");
    list.printList();

    System.out.println("Length of the list: " + list.length());
}
}

































