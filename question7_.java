import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

class myStack{
    SortedSet<Integer>min;
    Stack<Integer> s;
    int size;

    myStack(int size){
        s = new Stack<Integer>();
        min=new TreeSet<Integer>();
        this.size=size;
    }
    void getMin(){
    System.out.println("Minimum element is "+min.first());
    }
    void pop(){
        if(s.isEmpty()){
            System.out.println("Empty Stack not possible");
        }else {
            int temp=s.pop();
            System.out.println("Poped Element "+temp);
            if(min.contains(temp))
            {
                min.remove(temp);
            }
        }
    }
    public void push(int x){
        if(s.size()==size){
            System.out.println("Stack is Full");
        }
        else {
            s.push(x);
            min.add(x);
        }
    }
    void isEmpty(){
        if(s.size() == 0) System.out.println("stack is empty");
        else  System.out.println("stack is not empty");
    }
    void isFull(){
        if(s.size() == size){
            System.out.println("Stack is full");
        }else {
            System.out.println("Stack is not full");
        }
    }
    void PrintStack()
    {
        System.out.println("Stack elements are: "+s);
    }
}

public class question7_ {
    public static void main(String[] args) {
        myStack s= new myStack(5);
        s.push(12);s.push(21);s.push(2);s.push(1);s.push(5);
        s.PrintStack();
        s.push(32);
        s.getMin();
        s.pop();
        s.PrintStack();
        s.pop();
        s.getMin();
    }
}
