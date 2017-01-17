public class EulerThree {
  public static void main(String args[]) {
    long upperlimit = 600851475143L;
    long largestprime = 1L;                //Declare Variables
    for (int i = 1; i < upperlimit; i++) {      //Run through the checks
      if (upperlimit % i == 0) {
        largestprime = upperlimit / i;
        upperlimit = largestprime;
      }
    }
    System.out.println(largestprime);
  }
}