package binarysearch;

public class NextAlphabeticalElement {
    public static void main(String[] args) {
        int[] arr={'a','c','f','h'};
        int n=arr.length;
        int start=0;
        int end= n-1;
        char target= 'a';
        char res = '#';
        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]==target){
               start=mid+1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else if (arr[mid]>target) {
                res= (char) arr[mid];
                end=mid-1;
            }
        }
        System.out.println(res);
    }
}
