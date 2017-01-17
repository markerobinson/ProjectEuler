public class EulerFive {
  public static void main(String[] args) {
    int smallestnumber = 0;
    int count = 2520;
    do {
      if (checkDivision(count)) {
        smallestnumber = count;
        break;
      }
      count++;
    } while (true);
    System.out.println(smallestnumber);
  }
    
  
  public static boolean checkDivision(int value) {
    for (int i = 1; i <= 20; i++) {
      if (value % i != 0) {
        return false;
      }
    }
    return true;
  }
}