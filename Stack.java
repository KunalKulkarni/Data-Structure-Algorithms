public class Main{

  int size;
  int arr[];
  int top;
  Main(int size){
    this.size=size;
    this.arr=new int[size];
    this.top=-1;
  }
  public boolean isFull(){
    if((size-1) == top)
      return true;
    return false;
  }
  public boolean isEmpty(){
    if(top == -1)
      return true;
    return false;
  }
  public void push(int element){
    if(!isFull()){
      top++;
      arr[top]=element;
      System.out.println("Element pushed to Stack");
    }
    else
      System.out.println("Stack is full");
  }
  public void pop(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
    }
    else{
      System.out.println("Removed from top");
      top--;
    }
  }
  public static void main(String args[]){
    Main obj=new Main(5);
    obj.push(10);
    obj.push(3);
    obj.pop();
    obj.pop();
    System.out.println(obj.arr[0]);
  }

}
