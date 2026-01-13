package LinkList;

public class LinkList {

   Node head;

     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
     }



     public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }



     public void addLast(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
         return;
      }

      Node temp = head;
      while(temp.next != null){
         temp = temp.next;
      }
      temp.next = newNode;
     }



     public void deleteFirst(){
      if(head == null){
         System.out.println("list is empty");
         return;
      }
      head = head.next;
     }



     public void deleteLast(){
      if(head == null){
         System.out.println("list is empty");
         return;
      }

      if(head.next==null){
         head = null;
         return;
      }

      Node temp = head;

      while(temp.next.next != null){
         temp = temp.next;
      }
      temp.next = null;
     }



     public void printList(){
      if(head == null){
         System.out.println("list is empty");
         return;
      }

      Node temp = head;
      while(temp!=null){
         System.out.print(temp.data + "->");
         temp = temp.next;
      }
      System.out.println("null");
     }

     public boolean search(int key){
      Node temp =head;
      while(temp!=null){
         if(temp.data == key){
            return true;
         }
         temp=temp.next;
      }
      return false;
     }

     public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.search(2));
     }
}
