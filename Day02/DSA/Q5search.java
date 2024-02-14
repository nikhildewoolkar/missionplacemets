package DSA;
import java.util.*;

// time complexity of linear search is O(n)
class linear_search{
	linear_search(int arr[],int val) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==val) {
				System.out.println(val+" found at "+i+" position.");
				return;
			}
		}
		System.out.println(val+" not found.");
	}
}

//time complexity of linear search is O(log n)
class binary_search{
	binary_search(int arr[],int val){
		int n=arr.length;
		int start=0,end=n-1,mid;
		while(start<=end) {
			mid= (start+end)/2;
			if(arr[mid]==val) {
				System.out.println(val+" found at "+mid+" position.");
				return;
			}
			else if(arr[mid]<val) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		System.out.print(val+" not found.");
	}
}

public class Q5search {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60,70,80,90};
		System.out.print("Enter key to find: ");
		int n=sc.nextInt();
		System.out.println("By linear Search.");
		linear_search ls = new linear_search(arr,n);
		System.out.println("By Binary Search.");
		binary_search bs = new binary_search(arr,n);
		sc.close();
	}
}
