package binarysearch;

public class FindElementInRotedSortedArray {
    static int countRotations(int[] arr, int n,int target) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
           int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
           else if (arr[start] <= arr[mid]){
                  if (target >= arr[start] && target < arr[mid]){
                       end=mid-1;
                  }
                  else {
                      start=mid+1;
                  }
            }
           else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={11,12,15,18,2,5,6,8};
        int n=arr.length;
        int target=8;
        System.out.println(countRotations(arr,n,target));
    }
}
