package binarysearch;

public class CountRotationTime {
    static int countRotations(int[] arr, int n)
    {
        int start = 0;
        int end= n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={11,12,15,18,2,5,6,8};
        int n=arr.length;
        System.out.println(countRotations(arr, n));
    }
}
