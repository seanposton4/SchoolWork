public class n4 {
  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 7};
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        for (int k = 0; k < arr.length; k++) {
          for (int l = 0; l < arr.length; l++) {
            System.out.println(count);
            count += 1;
          }
        }
      }
    }    
  }
}
