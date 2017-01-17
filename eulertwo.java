public class eulertwo {
  public static void main(String[] args) {
    int first = 1;
    int second = 2;
    int third = 0;
    int sum = 2; //To include the 2 as even in the fibonacci sequence
    while (first + second < 4000000) {
      third = first + second;
      if (third % 2 == 0) {
        sum = sum + third;
      }
      first = second;
      second = third;
      //System.out.println(first + " " + second + " " + third);
    }
    System.out.println(sum);
  }
}