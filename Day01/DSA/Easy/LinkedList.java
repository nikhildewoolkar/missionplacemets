import java.util.*;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
      this.data = data;
      this.next = null;
    }

    public LinkedListNode(int data, LinkedListNode next) {
      this.data = data;
      this.next = next;
    }
}

class Operations{
  public LinkedListNode insertatEnd(Scanner scan, LinkedListNode head){
    int val = scan.nextInt();
    LinkedListNode temp = head;
    if(head == null){
      LinkedListNode insertNode = new LinkedListNode(val, null);
      head = insertNode;
      return head;
    } else{
      while(temp.next != null){
        temp = temp.next;
      }
      LinkedListNode insertNode = new LinkedListNode(val);
      temp.next = insertNode;
      return head;
    }
  }

  public LinkedListNode insertatStart(Scanner scan, LinkedListNode head){
    int val = scan.nextInt();
    LinkedListNode tempnode = new LinkedListNode(val, head);
    return tempnode;
  }

  public void countElement(Scanner scan, LinkedListNode head){
    int count = 0;
    while(head != null){
      head = head.next; 
      count++;
    }
    System.out.println("Number of elements are: " + count);
    return;
  }

  public LinkedListNode deleteAtEnd(Scanner scan, LinkedListNode head){
    LinkedListNode temp = head;
    if(head == null|| head.next == null){
      return null;
    }
    while(temp.next != null){
      if(temp.next.next == null) {
        temp.next = null;
        return head;
      };
      temp = temp.next;
    }
    return head;
  }

  public LinkedListNode deleteAtStart(Scanner scan, LinkedListNode head){
    if(head == null || head.next == null){
      return null;
    }
    head = head.next;
    return head;
  }

  public LinkedListNode deleteAtIndexorLast(Scanner scan, LinkedListNode head){
    System.out.println("Enter Index: ");
    int index = scan.nextInt();
    if(head == null || head.next == null) return null;
    if (index == 0) return head.next;
    LinkedListNode prev = null;
    LinkedListNode current = head;
    int count = 0;
    while (current != null) {
        if (count == index) {
            prev.next = current.next;
            break;
        }
        count++;
        prev = current;
        current = current.next;
    }

    return head;
  }

  public LinkedListNode addAtIndexorLast(Scanner scan, LinkedListNode head){
    System.out.println("Enter Index: ");
    int index = scan.nextInt();
    System.out.println("Enter value: ");
    int value = scan.nextInt();
    LinkedListNode newNode = new LinkedListNode(value);
    if (head == null) return newNode;
    
    if (index == 0) {
      newNode.next = head;
      return newNode;
    }
    LinkedListNode prev = null;
    LinkedListNode current = head;
    int count = 0;
    while (current != null && count < index) {
      prev = current;
      current = current.next;
      count++;
    }
    if (current == null) {
      prev.next = newNode;
    } else {
      prev.next = newNode;
      newNode.next = current;
    }
    return head;
  }

  public void displayList(Scanner scan, LinkedListNode head){
    LinkedListNode temp = head;
    if(head == null){
      System.out.println("List is Empty");
      return;
    }
    System.out.println("Elements are: ");
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }  
    return;
  }
}

class LinkedList{
  public static void main(String args[]){
    Operations list = new Operations();
    Scanner scan = new Scanner(System.in);
    LinkedListNode head = null;
    System.out.println("Enter 1 to invoke insertatEnd()");
    System.out.println("Enter 2 to invoke insertatStart()");
    System.out.println("Enter 3 to invoke countElement()");
    System.out.println("Enter 4 to invoke deleteAtEnd()");
    System.out.println("Enter 5 to invoke deleteAtStart()");
    System.out.println("Enter 6 to invoke deleteAtIndexorLast()");
    System.out.println("Enter 7 to invoke addAtIndexorLast()");
    System.out.println("Enter 8 to invoke displayList()");
    System.out.println("Enter 0 to terminate");
    System.out.println("Enter Option: ");
    int opt = -1;
    while(opt != 0){
      opt = scan.nextInt();
      switch(opt){
        case 1:
          head = list.insertatEnd(scan, head);
          break;
        case 2:
          head = list.insertatStart(scan, head);
          break;
        case 3:
          list.countElement(scan, head);
          break;
        case 4:
          head = list.deleteAtEnd(scan, head);
          break;
        case 5:
          head = list.deleteAtStart(scan, head);
          break;
        case 6:
          head = list.deleteAtIndexorLast(scan, head);
          break;
        case 7:
          head = list.addAtIndexorLast(scan, head);
          break;
        case 8:
          list.displayList(scan, head);
          break;
        default:
          System.out.println("Invalid option.");
      }
      System.out.println("Enter 1 to invoke insertatEnd()");
      System.out.println("Enter 2 to invoke insertatStart()");
      System.out.println("Enter 3 to invoke countElement()");
      System.out.println("Enter 4 to invoke deleteAtEnd()");
      System.out.println("Enter 5 to invoke deleteAtStart()");
      System.out.println("Enter 6 to invoke deleteAtIndexorLast()");
      System.out.println("Enter 7 to invoke addAtIndexorLast()");
      System.out.println("Enter 8 to invoke displayList()");
      System.out.println("Enter 0 to terminate");
      System.out.println("Enter Option: ");
    }
    scan.close();
  }
}