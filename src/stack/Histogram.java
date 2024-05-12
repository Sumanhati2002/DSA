package stack;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] arr={6,2,5,4,5,1,6};
        int n=arr.length;
        //find NSL
        Stack<Integer> s=new Stack<>();
        int[] newArr=new int[n];
        Stack<Integer> indexStack = new Stack<>();
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && s.peek()>arr[i]){
                s.pop();
                indexStack.pop();
            }
            if (s.isEmpty()){
//                System.out.println(-1);
                newArr[i]=-1;
            }
            else {
//                System.out.println(s.peek());
//                newArr[i]=s.peek();
                newArr[i]=indexStack.peek();
            }
            s.push(arr[i]);
            indexStack.push(i);
        }
        //print the new arr
        for (int i=0;i<n;i++){
            System.out.println(newArr[i]);
        }

        //find NSR
        System.out.println("###########");
        Stack<Integer> s2=new Stack<>();
        int[] output = new int[n];
        for (int i=n-1;i>=0;i--){
            while (!s2.isEmpty() && s2.peek()>=arr[i]){
                s2.pop();
            }
            if (s2.isEmpty()){
//                System.out.println(-1);
                output[i] = -1;
            }
            else {
//                s2.peek();
                output[i] = s.peek();
            }
            s2.push(arr[i]);
        }
        // Printing the NSR values
        for (int i = 0; i < n; i++) {
            System.out.println(output[i]);
        }
    }
}
