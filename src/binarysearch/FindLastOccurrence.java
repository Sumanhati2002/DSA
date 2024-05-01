package binarysearch;

public class FindLastOccurrence {
    public static void main(String[] args) {
        int[] arr={2,4,10,10,10,20};
        int tergate=10;
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while (start<=end){
            int mid=start+((end-start)/2);
            if (tergate==arr[mid]){
                res=mid;
                start=mid+1;
            } else if (tergate<arr[mid]) {
                end=mid-1;
            }
        }
        System.out.println("last occurrence:"+res);
    }
}
