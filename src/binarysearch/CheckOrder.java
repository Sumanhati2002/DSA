package binarysearch;
//check either array sorted in ascending or descending order
public class CheckOrder {
    public static void main(String[] args) {
//        int[] arr={20,17,15,14,13,12,10,9,8,4};
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        if (arr[0]>arr[1]){
            System.out.println("descending");
        }
        else {
            System.out.println("ascending");
        }
    }
}
