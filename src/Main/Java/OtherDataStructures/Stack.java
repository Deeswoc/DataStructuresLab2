package Main.Java.OtherDataStructures;

public class Stack {
    int top;
    int stack[];


    public Stack(int stackSize) {
        top=-1;
        this.stack = new int[stackSize];
    }

    public int push(int n){
        if(top + 1 < stack.length){
            stack[++top] = n;
            return 0;
        }
        return -999;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int pop(){
        if(top!=-1){
            return stack[top--];
        }
        return -999999999;
    }

    public int peek(){
        if(top>=0){
            return stack[top];
        }
        return -999999999;
    }
}
