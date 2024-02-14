import java.util.*;

// stack implementation with push , pop, peek, print,print while vacating operation.(dynamic size stack)

class Operations {
  public ArrayList push(ArrayList arr,int n){
    arr.add(n);
    return arr;
  }

  public ArrayList pop(ArrayList arr){
    if(arr.size() == 0){
      System.out.println("Stack UnderFlow");
      return arr;
    }
    System.out.println(arr.get(arr.size() - 1));
    arr.remove(arr.size() - 1);
    return arr;
  }

  public void peek(ArrayList arr){
    if(arr.size() == 0){
      System.out.println("Stack UnderFlow");
      return;
    }
    System.out.println(arr.get(arr.size() - 1));
  }

  public void print(ArrayList arr){
    if(arr.size() == 0){
      System.out.println("Stack is empty");
      return;
    }
    for(int i = arr.size() - 1; i >= 0; i--){
      System.out.println(arr.get(i));
    }
  }

  public void printnClean(ArrayList arr){
    if(arr.size() == 0){
      System.out.println("Stack is empty");
      return;
    }
    for(int i = arr.size() - 1; i >= 0; i--){
      System.out.println(arr.get(i));
      arr.remove(i);
    }
  }
}

class DynamicStack {
  public static void main(String args[]){
    ArrayList<Integer> arr = new ArrayList<>();
    Operations ops = new Operations();

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 1 to invoke push()");
    System.out.println("Enter 2 to invoke pop()");
    System.out.println("Enter 3 to invoke peek()");
    System.out.println("Enter 4 to invoke print()");
    System.out.println("Enter 5 to invoke printnClean()");
    int opt = -1;
    
    while(opt != 0){
      opt = scan.nextInt();
      switch(opt){
        case 1:
          int n = scan.nextInt();
          arr = ops.push(arr, n);
          break;
        case 2:
          arr = ops.pop(arr);
          break;
        case 3:
          ops.peek(arr);
          break;
        case 4:
          ops.print(arr);
          break;
        case 5:
          ops.printnClean(arr);
          break;
        default:
          System.out.println("Invalid option.");
      }
      System.out.println("Enter 1 to invoke push()");
      System.out.println("Enter 2 to invoke pop()");
      System.out.println("Enter 3 to invoke peek()");
      System.out.println("Enter 4 to invoke print()");
      System.out.println("Enter 5 to invoke printnClean()");
    }

    scan.close();

  }
}