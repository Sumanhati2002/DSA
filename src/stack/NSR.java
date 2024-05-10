package stack;

import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        int[] arr={4,10,5,18,3,12,7};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
            }
            if (s.isEmpty()){
                System.out.println(-1);
            }
            else {
                System.out.println(s.peek());
            }
            s.push(arr[i]);
        }
    }
}
