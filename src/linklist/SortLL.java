package linklist;

public class SortLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print(){

    }
    public static void main(String[] args) {
      SortLL sl=new SortLL();
      sl.addFirst(1);
      sl.addFirst(2);
      
    }
}
