package binarysearch;

public class FindFloor {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8,10,10,12,19};
        int n=arr.length;
        int start=0;
        int end= n-1;
        int target= 13;
        int res=-1;
        while (start<=end){
           int mid= start+(end-start)/2;
           if (arr[mid]==target){
               System.out.println(mid);
               return;
           }
           else if (target<arr[mid]) {
               end=mid-1;
           }
           else if (target>arr[mid]) {
               res=arr[mid];
               start=mid+1;
           }
        }
        System.out.println(res);
    }
}
