package linklist;

public class DeleteOperationLL {
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
    //for print
    public void printList(){
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete First
    public void deleteFirst(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    //Delete Last
    public void DeleteLast(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node secondlastnode=head;
        Node lastnode=head.next;
        while (lastnode.next!=null){
            secondlastnode=secondlastnode.next;
            lastnode=lastnode.next;
        }
        secondlastnode.next=null;
    }
    //Delete any position
    public void deleteAnyPosition(int position){
        Node currNode=head;
        Node prevnode=null;
        if (position<1){
            System.out.println("invalid position");
            return;
        }
        else if (position==1) {
            head=head.next;
            return;
        }
        while (--position>0){
            prevnode=currNode;
            currNode=currNode.next;
        }
        prevnode.next=currNode.next;
//        currNode.next=currNode.next.next;
    }
    public static void main(String[] args) {
        DeleteOperationLL dl=new DeleteOperationLL();
        dl.addFirst(11);
        dl.addFirst(12);
        dl.addFirst(13);
       //dl.deleteFirst();
        //dl.DeleteLast();
        dl.deleteAnyPosition(3);
        dl.printList();
    }
}
