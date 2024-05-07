package binarysearch;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr={1,3,8,10,15};
        int n=arr.length;
        int start=0;
        int end=n-1;
        int target=16;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (target==arr[mid]){
                System.out.println(arr[mid]);
                return;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if ((arr[start] - target) < (target - arr[end])){
            System.out.println(arr[start]);
        }
        else {
            System.out.println(arr[end]);
        }
    }
}
