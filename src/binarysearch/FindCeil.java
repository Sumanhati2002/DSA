package binarysearch;

public class FindCeil {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10,10,12,19};
        int n=arr.length;
        int start=0;
        int end=n-1;
        int target=9;
        int res=-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            } else if (target<arr[mid]) {
                res=arr[mid];
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        System.out.println(res);
    }
}
