package DataStructure.Stack;

public class Stack {
    int [] arr;
    int top;
    int size;
    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    void push(int val){
        if(top==size-1){
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }
    int top(){
        if(top==-1){
            System.out.println("Stack undeflow");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
class Driver{
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.top());

        st.pop();
        System.out.println("Top after pop: " + st.top());
    }
}
