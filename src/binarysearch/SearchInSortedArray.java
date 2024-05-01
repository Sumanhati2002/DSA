package binarysearch;
//search element in a sorted array
public class SearchInSortedArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int targate=3;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start+((end-start)/2);
            if (targate==arr[mid]){
                System.out.println(mid);
                return;
            }
            else if (targate< arr[mid]) {
                      end= mid-1;
            }
            else if (targate> arr[mid]) {
                start=mid+1;
            }
            else {
                System.out.println("element not present");
            }
        }
    }
}
