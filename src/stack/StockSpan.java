package stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && s.peek()<arr[i]){
                s.pop();
                indexStack.pop();
            }
            if (s.isEmpty()){
                System.out.println(-1);
            }
            else {
                System.out.println(i - indexStack.peek());
            }
            s.push(arr[i]);
            indexStack.push(i);
        }

        }
}
