package stackAndqueue;
import java.util.*;

public class stackUsingQueue {
    Queue<Integer> q;

    public stackUsingQueue(){
        q= new LinkedList<>();
    }

    public void push(int x){
        q.add(x);
        int size =q.size();

        for(int i= 1 ;i < size ;i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return q.remove();
    }

    public int top(){
        if(q.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return q.peek();
    }

    public boolean empty(){
        return q.isEmpty();
    }

    public static void main(String[] args){
        stackUsingQueue stack = new stackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());
        System.out.println(stack.pop());
    }
}
