public class EulerFour {
  public static void main(String[] args) {
    int largestpalindrome = 0;
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        if (i * j > largestpalindrome && checkPalindrome(i * j)) {
            largestpalindrome = i * j;
        }
      }
    }
    System.out.println(largestpalindrome);
  }
  public static boolean checkPalindrome(int value) {
    String text = Integer.toString(value);
    String reverse = new StringBuffer(text).reverse().toString();
    if (text.equals(reverse)) {
      return true;
    } else {
      return false;
    }
  }
}