import java.awt.HeadlessException;

class Main {
  int capacity=0;
  Node head;
  class Node{
    Node next;
    int val;
  }
  public void push(int value){

    Node newNode=new Node();
    if(newNode == null){
      System.out.println("Heap Overflow");
      return;
    }
    newNode.val=value;
    newNode.next=head;
    head=newNode;

  }
  public boolean isEmpty(){
    if(head == null)
      return true;
    else
      return false;
    
  }
  public int pop(){
    int val=head.val;
    head=head.next;
    return val;
  }
  public void print(){
    Node curr=head;
    while(curr!=null){
      System.out.println(curr.val);
      curr=curr.next;
    }
  }
  public static void main(String[] args) {
    Main obj=new Main();
    obj.push(5);
    obj.push(6);
    obj.push(10);
    //obj.print();
    obj.pop();
    obj.print();
  }
}
