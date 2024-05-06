package binarysearch;

public class IndexOfFirstOne {
    static int countRotations(int[] arr, int start, int target, int end){
        int res=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                res=mid;
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
        int start=0;
        int end=1;
        int target= 1;
        while (target>arr[end]){
            start=end;
            end=end*2;
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }
        System.out.println(countRotations(arr, start, target, end));
    }
}
