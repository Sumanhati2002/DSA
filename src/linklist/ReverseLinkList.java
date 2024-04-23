package linklist;

public class ReverseLinkList {
    Node head;
    //first create a node class
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    // add item in first position
    public void addFirst(int data){
        Node newnode=new Node(data);

        if (head==null){
            head= newnode;
            return;
        }
        newnode.next= head;
        head= newnode;
    }

        //print the list
    public void printList(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode=head;
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    //reverse the item
    public void reverseItem(){
        if (head==null || head.next==null){
            return;
        }
        Node currNode=head;
        Node preNode=head.next;
        while (currNode!=null){
           Node nextNode=currNode.next;
           currNode.next=preNode;

           //update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }
    public static void main(String[] args) {
        ReverseLinkList rll=new ReverseLinkList();
        rll.addFirst(1);
        rll.addFirst(2);
        rll.addFirst(3);
        rll.printList();

        System.out.println("after reverse----");
        rll.reverseItem();
        rll.printList();
    }
}
