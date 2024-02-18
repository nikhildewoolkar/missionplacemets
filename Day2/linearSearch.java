public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {34,24,56,19,54};
        int target = 19;
        int ans = linearSearch(nums, target);
            System.out.println(ans);
        }
        static int linearSearch(int[] arr, int target) {
            if(arr.length == 0) {
                return -1;
            }
    //        runs for loop
            for(int i=0; i<arr.length; i++){
    //            check element at every index if it is = target
                int element = arr[i];
                if(element == target){
                    return i;
                }
            }
    //        this line will be execute if none of
            return -1;
        }
}
