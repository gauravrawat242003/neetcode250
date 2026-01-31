package stackAndqueue;

public class stackArray{
    private int size;
    private int top;
    private int[] stack;

    public stackArray(){
        this(1000);
    }

    public  stackArray(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int x){
        if(top >= size-1){
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        // int removed = stack[top];
        // top--;
        // return removed 
        //or
        return stack[top--];
    }

    public int top(int x){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //for displaying all elem in stack

    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }

        System.out.println("stack elements:");
        for(int i=0 ; i<=top;i++){
            System.out.println(stack[i]);
        }
        System.out.println();
    }
}

 class implementUsingArray {
    public static void main(String[] args) {
        stackArray s = new stackArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
