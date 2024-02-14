package DSA;

public class insertionsort{
	
	void insertion(int arr[]) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j= i-1;
			
			while(j >=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String a[]) {
		int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6};
		insertionsort is = new insertionsort();
		System.out.print("Array before sorting: ");
		is.print(arr);
		is.insertion(arr);
		System.out.print("\nArray after sorting: ");
		is.print(arr);;
	}
}