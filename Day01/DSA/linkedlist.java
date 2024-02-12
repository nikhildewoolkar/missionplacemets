package Day01.DSA;
import java.util.*;

class node{
    int value;
    node next;
    node(int value){
        this.value=value;
        this.next=null;
    }
}

class Linked_List{
    node head;
    Linked_List(){
        this.head=null;
    }

    // Function to insert element into linked from head
    void insertatstart(int value){
        node newnode=new node(value);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    // Function to insert element into linked from end
    void insertatend(int value){
        node newnode=new node(value);
        if(head==null){
            head=newnode;
        }
        else{
            node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }

    // Function to insert in the linked list from the given position
    void insertatpos(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter position to insert: ");
        int position=sc.nextInt();
        System.out.println("Enter number to be inserted:");
        int value=sc.nextInt();
        sc.close();
        node newnode=new node(value);
        if(head==null){
            System.out.println("Range out of bounds");
            return;
        }

        if(position==0){
            insertatstart(value);
            return;
        }
        int currentpos=1;
        node prev=head;
        node current=prev.next;
        while(current.next!=null && currentpos < position){
            prev=current;
            current=current.next;
            currentpos++;
        }
        if(currentpos==position-1){
            insertatend(value);
            return;
        }else
        if(currentpos!=position){
            System.out.println("Range out of bounds");
            return;
        }
        prev.next=newnode;
        newnode.next=current;   
    }

    // function to remove element from the head
    void removefromstart(){
        if(head==null){
            System.out.println("List is empty");
        }
        
        if(head.next==null){
            System.out.println("\nElement removed is: "+head.value);
            head=null;
        }
        else{
            System.out.println("\nElement removed is: "+head.value);
            node temp=head;
            head=head.next;
            temp=null;
        }
    }

    // function to remove elements from the list from end
    void removefromend(){
        if(head==null){
            System.out.println("List is empty");
        }

        if(head.next==null){
            System.out.println("\nElement removed is: "+head.value);
            head=null;
        }
        else{
            node prev=head;
            node current=prev.next;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            System.out.println("\nElement removed is: "+current.value);
            prev.next=null;
            current=null;
        }
    }

    // Function to remove element from the list by value
    void removebyvalue(int value){
        int position = 0;
        if(head==null){
            System.out.println("\nList is empty");
            return;
        }

        if(head.value==value && head.next==null){
            System.out.println("\nElement removed is: "+head.value);
            head=null;
            return;
        }
        else if(head.value==value && head.next!=null){
            System.out.println("\nElement removed is: "+head.value+" from position "+position);
            node current=head;
            head=head.next;
            current=null;
        }
        else{
            node prev=head;
            node current=prev.next;
            position = 1;
            while(current.value!=value && current.next!=null){
                prev=current;
                current=current.next;
                position++;
            }
            
            if (current.value == value) {
                System.out.println("\nElement removed is: "+current.value+" from position "+position);
                prev.next=current.next;
                current=null;
            }
            else{
                System.out.println("\nElement not found.");
            }
            position=0;
        }
    }

    // Function to remove element from the list by position
    public void removeByPosition(int position) {
        if (position < 0 || head == null) {
            System.out.print("Range is out of bounds");
            return;
        }
    
        if (position == 0) {
            System.out.println("Removed element: " + head.value);
            node current=head;
            head = head.next;
            current=null;
            return;
        }
    
        int currentPosition = 0;
        node prev = null;
        node current = head;
    
        while (current != null && currentPosition < position) {
            prev = current;
            current = current.next;
            currentPosition++;
        }
    
        if (currentPosition != position || current == null) {
            System.out.print("Position is out of bounds");
            return;
        }
        System.out.println("Removed element: " + current.value);
        prev.next = current.next;
    }
    

    // Function to display linked list
    void display(){
        node current=head;
        while(current != null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }
}



public class linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List ls=new Linked_List();

        ls.insertatstart(10);
        ls.insertatstart(20);
        ls.insertatstart(30);
        ls.insertatstart(40);
        ls.insertatend(50);
        ls.display();
        
        ls.removefromstart();
        ls.display();
        
        ls.removefromend();
        ls.display();
        
        ls.insertatstart(40);
        ls.insertatend(50);
        ls.removebyvalue(50);
        ls.display();
        ls.removebyvalue(20);
        ls.display();

        ls.insertatpos();
        ls.display();

        ls.removeByPosition(0);
        ls.display();
        sc.close();
    }
}
