package stackAndqueue;

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class queueUsingLL{
    Node front;
    Node rear;
    int size;

    public queueUsingLL{
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int x){
        Node newNode = new Node(x);

        if(rear == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }
        int poped = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return poped;
    }

    public int peek(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

 class implementQueue{
    public static void main(String[] args) {
        
    }
}
