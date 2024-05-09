package stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int res=-1;
            for (int j=0;j<=i;j++){
                if (arr[j]>arr[i]){
                    res=arr[j];
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
