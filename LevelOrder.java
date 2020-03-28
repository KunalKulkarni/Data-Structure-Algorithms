import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePreOrder{

  public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public Node createTree(){
    Node node1=new Node(50);
    Node node2 =new Node(80);
    Node node3= new Node(30);
    Node node4= new Node(40);
    node1.left= node2;
    node1.right= node3;
    node2.right= node4;
    return node1;
  }
  public static void main(String args[]){
    BinaryTreePreOrder binaryTreePreOrder= new BinaryTreePreOrder();
    Node rootNode=binaryTreePreOrder.createTree();
    binaryTreePreOrder.levelOrder(rootNode);
  }
  public void levelOrder(Node rootNode){
    Queue<Node> queue=new LinkedList<>();
    queue.add(rootNode);
    while(!queue.isEmpty()){
      Node node=queue.poll();
      System.out.println(node.data);
      if(node.left!=null)
        queue.add(node.left);
      if(node.right!=null)
        queue.add(node.right);
    }
  }
}
