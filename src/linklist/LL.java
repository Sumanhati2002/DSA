package linklist;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    //first create a node class
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add item in first position
    public void addFirst(String data){
        Node newnode=new Node(data);

        if (head==null){
            head= newnode;
            return;
        }
        newnode.next= head;
        head= newnode;
    }

    //add item in last position
    public void addLast(String data){
        Node newnode=new Node(data);
        if (head==null){
            head= newnode;
            return;
        }
        Node currentNode=head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
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
    // delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last
    public void deleteLast(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secoundLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secoundLast=secoundLast.next;
        }
        secoundLast.next=null;
    }
    //measure size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("s");
        list.addFirst("a");
        list.addLast("hati");
        list.addLast("aa");
        list.printList();

        System.out.println("after deleting first----");
        list.deleteFirst();
        list.printList();

        System.out.println("after deleteing last---");
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
