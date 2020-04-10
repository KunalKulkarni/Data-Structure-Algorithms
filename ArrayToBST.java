import java.awt.HeadlessException;

class Main {

  class Node{
    Node left;
    Node right;
    int val;
    Node(int val){
      this.val=val;
    }
  }

  public static void main(String[] args) {
    Main obj=new Main();
    int [] sortedArray={34,45,56,76,89,90};
   Node root= obj.makeTree(sortedArray,0,sortedArray.length-1);
   obj.printTree(root);
  }

  public Node makeTree(int[] sortedArray,int start, int end){
    if(start>end){
      return null;
    }
    int middle=(start+end)/2;
    Node node=new Node(sortedArray[middle]);
    node.left= makeTree(sortedArray, start, middle-1);
    node.right= makeTree(sortedArray, middle+1,end);
    return node;
  }

  public void printTree(Node root){
    if(root==null)
      return;
    printTree(root.left);
    System.out.println(root.val+" ");
    printTree(root.right);
  }
}

//O(n)
