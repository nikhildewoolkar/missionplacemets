package DSA;

//Creating nodes for linked list.
class node{
	int value;
	node prev;
	node next;
	node(int value){
		this.value=value;
		this.prev=null;
		this.next=null;
	}
}

class doubly_linkedlist{
	node head;
	doubly_linkedlist(){
		this.head=null;
	}
	
	// Function to insert value in start of linked list
	void insert_start(int value) {
		node newnode = new node(value);
		
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	
	// Function to insert value in end of linked list
	void insert_end(int value) {
		node newnode =new node(value);
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newnode;
			newnode.prev=current;
		}
	}
	
	// Function to insert value at given location
	void insert_location(int value, int loc) {
		node newnode=new node(value);
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		
		int pos=1;
		node previous = head;
		node current= previous.next;
		while(previous!=null) {
			previous=previous.next;
			pos++;
			System.out.println("pos: "+pos);
		}
		if(loc>pos || loc<0) {
			System.out.println("Out of bound enter valid position for "+value);
			return;
		}
		
		pos=1;
		while(current!=null && pos < loc) {
			previous=current;
			current=current.next;
			pos++;
		}
		previous.next=newnode;
		newnode.prev=previous;
		newnode.next=current;
	}
	
	// Function to remove from head
	void remove_head() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Removed elemnet is: "+head.value);
		head=head.next;
	}
	
	// Function to remove from tail
	void remove_tail() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		node previous=head;
		node current=previous.next;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		System.out.println("Removed element is: "+current.value);
		previous.next=null;
		current=null;
	}
	
	// Function to remove from given location
	void remove_loc(int loc,int size) {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		if(loc>size) {
			System.out.println("Out of Bound size of list is: "+size);
			return;
		}
		node previous=head;
		node current=previous.next;
		int pos=1;
		while(current.next!=null && pos<loc) {
			previous=current;
			current=current.next;
			pos++;
		}
		node currentnext=current.next;
		previous.next=current.next;
	}
	
	// Function to return length of linked list
	int length() {
		node current=head;
		int size=0;
		while(current!=null) {
			size++;
			current=current.next;
		}
		return size;
	}
	
	// Function to print linked list
	void print() {
		node current=head;
		while(current!=null) {
			System.out.print(current.value+" ");
			current=current.next;
		}
		System.out.println();
	}
}

public class doublylinklist {
	public static void main(String a[]) {
		doubly_linkedlist DL = new doubly_linkedlist();
		
		DL.insert_start(20);
		DL.insert_start(30);
		DL.insert_start(40);
		DL.insert_end(10);
		DL.print();
		
		DL.insert_location(5, 5);
		DL.print();
		
		DL.remove_head();
		DL.print();
		
		DL.remove_tail();
		DL.print();
		
		int size=DL.length();
		System.out.println("size: "+size);
		
		DL.remove_loc(4, size);
		DL.print();
	}
}
