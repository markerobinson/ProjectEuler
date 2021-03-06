public class EulerSeven{
  public static void main(String[] args) {
    int counter = 3;
    int primecounter = 2;
    while (primecounter < 10001) {
      counter++;
      if (checkPrime(counter)) {
        primecounter++;
      }
    }
    System.out.println(counter);
  }
  
  public static boolean checkPrime(int value) {
    for (int i = 2; i < value; i++) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;
  }
}