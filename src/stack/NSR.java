package stack;

public class NSR {
    public static void main(String[] args) {
        int[] arr={3,2,1,0};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int res=-1;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[i]){
                    res=arr[j];
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
