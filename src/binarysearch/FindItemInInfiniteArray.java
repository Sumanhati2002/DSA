package binarysearch;

public class FindItemInInfiniteArray {

    static int countRotations(int[] arr, int start, int target, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else { // target < arr[mid]
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //assume this is an infinite array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10};
        int target = 2;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            start = end;
            end *= 2;
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }
        System.out.println(countRotations(arr, start, target, end));
    }
}
