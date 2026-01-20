package stackAndqueue;

public class queueArray {
    private int[] queue;
    private int size , front , rear, maxSize;

    public queueArray(){
       queue = new int[10];
       front = -1;
       rear = -1;
       size = 0;
       maxSize = 10;
    }

    public void push(int x){
        if(size == maxSize){
            System.out.println("queue id full");
            return;
        }

        if(rear == -1){
            front = 0;
            rear = 0;
        }else{
            //circular increment
            rear = (rear+1) % size;
        }

        queue[rear] = x;
        size++;
    }

    public int pop(){
        if(front == -1){
            System.out.println("empty");
            return -1;
        }
        int poped = queue[front];

        if(size == 1){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%size;
        }
        size--;
        return poped;
    }

   public int peek(){
    if(front == -1){
        System.out.println("queue is empty");
        return -1;
    }
    return queue[front];
   } 

   public boolean isEmpty() {
        return (size == 0);
    }
}

 class implementQueue{
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
 }