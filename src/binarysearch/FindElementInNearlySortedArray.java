package binarysearch;

public class FindElementInNearlySortedArray {
    static int countRotations(int[] arr, int n, int target) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            else if (mid > 0 && arr[mid - 1] == target) {
                return mid - 1;
            }
            else if (mid < n - 1 && arr[mid + 1] == target) {
                return mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 2;
            }
            else {
                start = mid + 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int n = arr.length;
        int target = 40;
        System.out.println(countRotations(arr, n, target)); // Output should be 2
    }
}
