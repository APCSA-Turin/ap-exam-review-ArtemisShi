public class StringPatterns {
  /** Returns the String that results when letter and pattern are
    * compared, as described in part (a)
    *
    * Precondition: letter consists of one uppercase letter.
    *     pattern has at least 2 letters and all letters are uppercase
    *     and unique.
    */
  public static String letterAndPattern(String letter, String pattern) {
    String place ="";
    for(int i=0; i<pattern.length();i++){
    if(pattern.substring(i,i+1).equals(letter)){
    return letter;
    }
    }
    for(int i=pattern.length();i>0;i--){
    place+=pattern.substring(i-1,i);
    }
    return place;
  }
}
