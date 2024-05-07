package stack;

public class NSL {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int res=-1;
            for (int j=0;j<i;j++){
                if (arr[i]>arr[j]){
                    res=arr[j];
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
