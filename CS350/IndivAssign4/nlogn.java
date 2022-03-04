public class nlogn {
  public static void swap(int[] arr, int i, int j) {
    //Function to make swapping two items easier and more succint.
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static int partition(int[] arr, int low, int high) {
    //Will pick the highest index element as a pivot, and sort all smaller to left of pivot
    //and all greater to the right of pivot.
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return (i + 1);
  }

  //partitionIndex will be placed at its correct spot, and then 
  //the function will recursively do this for each element lower and higher than it.
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      quickSort(arr, low, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, high);
    }
  }

  public static void main(String[] args) {
    //Quicksort Algorithm
    int[] data = {15, 14, 12, 21, 69, 42, 99};

    System.out.println("Array Before Quicksort:");
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }

    quickSort(data, 0, data.length - 1);

    System.out.println("\nArray After Quicksort:");
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
  }
}