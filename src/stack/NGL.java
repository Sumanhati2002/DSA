package stack;
import java.util.Stack;

public class NGL {
    public static void main(String[] args) {
        int[] arr={4,10,5,18,3,12,7};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && s.peek()<arr[i]){
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
