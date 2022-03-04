import java.lang.Math;
public class nroot {
  public static void main(String[] args) {
    double n = 1000000;
    int count = 0;
    
    System.out.println("calculating...");
    while (n >= 1 && count <= 35) {
      n = Math.pow(n, 1.0/4.0);
      System.out.println(n);
      count += 1;
    }

    System.out.println("Times run: " + count);
  }
}
