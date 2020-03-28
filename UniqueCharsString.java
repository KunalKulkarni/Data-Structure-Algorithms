import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String sentence= "kunnal";
    for(int i=0;i<sentence.length();i++){
      char c=sentence.charAt(i);
      if(sentence.indexOf(c)!=sentence.lastIndexOf(c)){
        System.out.println("Not unique");
        return;
      }
    }
    System.out.println("unique");
  }
}
