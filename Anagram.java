import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Is Anagram- "+ checkEquality("Hello","ollh"));
  }
  public static boolean checkEquality(String sent1,String sent2){
    String sortedSent1=sortChars(sent1);
    String sortedSent2= sortChars(sent2);
    if(sortedSent1.equals(sortedSent2))
      return true;
    return false;
  }
  public static String sortChars(String sentence){
    char [] setOfChars= sentence.toLowerCase().toCharArray();
    Arrays.sort(setOfChars);
    return String.valueOf(setOfChars);

  }
}
