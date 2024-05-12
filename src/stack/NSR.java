package stack;

import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        int[] arr={4,10,5,18,3,12,7};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        int[] output = new int[n];
        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                output[i] = -1;
            }
            else {
                output[i] = s.peek();
            }
            s.push(arr[i]);
        }
        // Printing the NSR values
        for (int i = 0; i < n; i++) {
            System.out.println(output[i]);
        }
    }
}
