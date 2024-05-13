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
            System.out.print(newArr[i]+",");
        }

        //find NSR
        System.out.println("###########");
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> indexStack1 = new Stack<>();
        int[] output = new int[n];
        for (int i=n-1;i>=0;i--){
            while (!s1.isEmpty() && s1.peek()>=arr[i]){
                s1.pop();
                indexStack1.pop();
            }
            if (s1.isEmpty()){
                output[i] = n;
            }
            else {
//                output[i] = s1.peek();
                output[i]=indexStack1.peek();
            }
            s1.push(arr[i]);
            indexStack1.push(i);
        }
        // Printing the NSR values
        for (int i = 0; i < n; i++) {
            System.out.print(output[i]+",");
        }

        //take another array
        System.out.println("############");
        int[] anotherArr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print(((output[i]-newArr[i])-1)*arr[i]+",");
        }
    }
}
