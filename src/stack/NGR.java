package stack;

public class NGR {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int next = -1;
            for (int j=i+1;j<n;j++){
                    if (arr[j]>arr[i]){
                        next=arr[j];
                        break;
                    }
            }
            System.out.println(next);
        }
    }
}
