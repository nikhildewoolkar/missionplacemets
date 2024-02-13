package Day_02.DSA;

import java.util.Scanner;

public class p05 {

    // Linear Search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    // Binary Search (assuming the array is sorted)
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element to search
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        // Perform Linear Search
        int linearIndex = linearSearch(arr, target);
        if (linearIndex != -1) {
            System.out.println("Linear Search: Element found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        // Perform Binary Search
        int binaryIndex = binarySearch(arr, target);
        if (binaryIndex != -1) {
            System.out.println("Binary Search: Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        sc.close();
    }
}

