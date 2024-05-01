package binarysearch;

public class FindFirstOccurrence {
    public static void main(String[] args) {
        int[] arr={2,4,10,10,10,18,20};
        int tergate=10;
        int start=0;
        int res=-1;
        int end=arr.length-1;
        //now find first occurrence
        while (start<=end){
            int mid=start+((end-start)/2);
            if (tergate==arr[mid]){
                res=mid;
                end=mid-1;

            }
            else if (tergate>arr[mid]) {
                start=mid+1;
            }
        }
        System.out.println("1st occurence "+res);
    }
}
