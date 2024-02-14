package missionplacemets.day_2.DSA;

class Search {
    // Linear Search
    public boolean linearSearch(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    // Binary Search
    public boolean binarySearch(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}

public class que5 {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 7, 3, 10, 1 };
        int target = 10;
        Search s1 = new Search();
        System.out.println(s1.linearSearch(target, arr));
        System.out.println(s1.binarySearch(target, arr));
    }
}
