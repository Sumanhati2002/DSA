package linklist;

public class AddOperationLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //add first
    public void addFirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //add last
    public void addLast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;

        }
        Node currnode=head;
        while (currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    //print
    public void print(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while (currnode!=null){
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    //add any position
    public void addAnyPosition(int data, int position){
        Node newnode=new Node(data);
        //for invalid position
        if (position<1){
            System.out.println("invalid position");
        }
        //inserting first position
        else if (position==1) {
            newnode.next=head;
            head=newnode;
        }
        //
        else {
            Node currnode=head;
            while (--position>1){
                currnode=currnode.next;
            }
            newnode.next=currnode.next;
            currnode.next=newnode;
        }
    }
    public static void main(String[] args) {
      AddOperationLL st=new AddOperationLL();
      st.addFirst(1);
      st.addFirst(2);
      st.addLast(11);
      st.addAnyPosition(31,2);
      st.print();
    }
}
