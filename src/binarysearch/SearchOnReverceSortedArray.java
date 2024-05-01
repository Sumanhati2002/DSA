package binarysearch;

public class SearchOnReverceSortedArray {
    //search element in an array which is sorted in descending order
    public static void main(String[] args) {
        int[] arr={20,17,15,14,13,12,10,9,8,4};
        int start=0;
        int end= arr.length-1;
        int tergate=13;
        while (start<=end){
            int mid= start+((end-start)/2);
            if (tergate==arr[mid]){
                System.out.println(mid);
                return;
            }
            else if (tergate< arr[mid]) {
                start=mid+1;
            }
            else if (tergate> arr[mid]) {
                end= mid-1;
            }
            else {
                System.out.println("element not present");
            }
        }

    }
}
