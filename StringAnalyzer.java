public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
     public static int countRepeat(String largeStr, String smallStr) {
        
            int count=0;
            int length= smallStr.length();
            String place =largeStr;
            for(int i=0; i<place.length();i++){
            if(i+length<=place.length()&&place.substring(i,i+length).equals(smallStr)){
            count++;
            i+=length-1;
            }
            }
            return count;
            }
            
  }
  