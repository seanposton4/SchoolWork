#include <stdio.h>

void swap(int arr[], int i, int j) {
  // Takes the two indices of the array to swap.
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

int partition(int arr[], int low, int high) {
  // Set pivot to highest elem in subarray
  // Pivot will be placed at right position
  int pivot = arr[high];

  // Will indicate right position of pivot found
  int r = (low - 1);

  // If the current element in the loop is smaller than the pivot, increment r to show 
  for (int i = low; i <= high - 1; i++) {
    if (arr[i] < pivot) {
      r++;
      swap(arr, i, r);
    }
  }

  swap(arr, r + 1, high);
  return (r + 1);
}

void quick_sort(int arr[], int low, int high) {
  if (low < high) {
    // Get index to split array
    int pi = partition(arr, low, high);

    quick_sort(arr, low, pi - 1);
    quick_sort(arr, pi + 1, high);
  }
}

int main() {
  // Quick Sort Reference: https://www.geeksforgeeks.org/quick-sort/
  int arr[] = {24, 567, 23, 99, 1, 2, 50};
  int arr_len = sizeof(arr) / sizeof(arr[0]);

  quick_sort(arr, 0, arr_len - 1);

  for (int i = 0; i < arr_len; i++) {
    printf("%d ", arr[i]);
  }
}