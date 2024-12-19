public class Firsttwochar {
    public boolean startHi(String str) {
        // Make sure strung does not go past 2
        // if it goes past two substring will go past the end = bad
        if (str.length() < 2) return false;
        
        //Declare string that we will take out which is the first two charectes
        String firstTwoChar = str.substring(0, 2);
        
        // Use if loop to see if string we pulled out equals hi
        if (firstTwoChar.equals("hi")) {
          return true;
        } else {
          return false;
        }
      }
}
