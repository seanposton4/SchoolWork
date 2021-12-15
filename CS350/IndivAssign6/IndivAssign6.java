package IndivAssign6;

public class IndivAssign6 {
  public static void main(String[] args) {
    int n = 1000;

    // log n
    for (int i = 0; i < n; i *= 2) {
    }

    // n log n
    for (int i = 0; i < n; i++) {
      for (int j = n; j > 0; j /= 2) {
      }
    }

    // cube root
    for (int i = 0; i < Math.pow(n, 1/3); i++) {
    }

    // sqrt
    for (int i = 0; i < Math.sqrt(n); i++) {
    }

    // cubed
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
        }
      }
    }
  }
}
