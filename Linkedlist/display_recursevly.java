class display_by_recursevly
{
     public static void displayr(Node head)
     { 
        if(head==null) return;
        System.out.println(head.data);
        displayr(head.next);
     }
      public static class Node{
        int data;
        Node next;
        Node (int data)//constructor
        {
            this.data=data;
        }
    }
 public static void main(String[] args) {
     Node a =new Node(1);
     System.out.println(a.next);
     Node b =new Node(2);
     Node c =new Node(3);
     Node d =new Node(4);
     Node e =new Node(5);
     a.next=b;//all the nodes are connected to the each other
     b.next=c;
     c.next=d;
     d.next=e;
     displayr(a);
 }
}
