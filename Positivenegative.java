public class Positivenegative {
    public boolean posNeg(int a, int b, boolean negative) {
        //if boolean negative is true this means that int a is negative and b is negative
        if (negative) {
          return (a < 0 && b < 0);
        }
        //if boolean negative is not true this means that a is negative and b is positive OR a is positive and b is negative
        else {
          return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
      }
}
