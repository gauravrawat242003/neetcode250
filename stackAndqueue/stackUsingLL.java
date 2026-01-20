package stackAndqueue;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}


public class stackUsingLL {
    private Node top;
    private int size;

    public stackUsingLL(){
        top = null;
        size = 0;
    }

    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }

        int value = top.data;
        Node temp = top;
        top = top.next;
        temp = null;
        size--;

        return value;
    }

    public int top(){
        if(top == null)return -1;
        return top.data;
    }

    public boolean isEmpty(){
       return size == 0;
    }

    public void display(){
        if(top==null){
            System.out.println("stack ius empty");
            return;
        }

        Node temp = top;

        System.out.println("stacks element:");

        while(temp != null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
} 


class implementStackUsingLL{
    public static void main(String[] args) {
        stackUsingLL stack = new stackUsingLL();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
    }
}
