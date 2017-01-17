import java.math.BigDecimal;

public class EulerSix {
  public static void main(String[] args) {
    double upperlimit = 100;
    //System.out.prdoubleln("The sum of squares is " + sumsquare(upperlimit));
    //System.out.prdoubleln("The square of sums is " + squaresum(upperlimit));
    System.out.println(new BigDecimal(squaresum(upperlimit)-sumsquare(upperlimit)).toPlainString());
  }
  
  public static double sumsquare(double value) {
    double sum = 0;
    for (int i = 1; i <= value; i++) {
      sum = sum + Math.pow(i,2);
    }
    return sum;
  }
  
  public static double squaresum(double value) {
    double sum = 0;
    for (int i = 1; i <= value; i++) {
      sum = sum + i;
    }
    double squaresum = Math.pow(sum,2);
    return squaresum;
  }
}