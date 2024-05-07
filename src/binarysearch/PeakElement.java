package binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={5,10,20,15};
        int n=arr.length;
        int start=0;
        int end=n-1;
        int peak=0;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (mid>0 && mid<n-1){
                if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    System.out.println("peak element is:"+ arr[mid]);
                    return;
                }
               else if (arr[mid+1]>arr[mid]){
                    start=mid+1;
                }
               else {
                   end=mid-1;
                }
            }
            else if (mid==0) {
                if (arr[0]>arr[1]){
                    System.out.println("peak element is:"+ arr[0]);
                    return;
                }
                else {
                    System.out.println("peak element is:"+ arr[1]);
                    return;
                }
            } else if (mid==(n-1)) {
                if (arr[n-1]>arr[n-2]){
                    System.out.println("peak element is:"+ arr[n-1]);
                    return;
                }
                else {
                    System.out.println("peak element is:"+ arr[n-2]);
                    return;
                }
            }
        }

    }
}
