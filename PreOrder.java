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
    binaryTreePreOrder.preOrder(rootNode);
  }
  public void preOrder(Node rootNode){
    if(rootNode!=null){
      System.out.println(rootNode.data);
      preOrder(rootNode.left);
      preOrder(rootNode.right);
    }
  }
}
