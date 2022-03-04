#include <stdio.h>

void swap(int arr[], int i, int j) {
  // Takes the two indices of the array to swap.
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

void selection_sort(int arr[], int n) {
  int minimum;
  int min_ind;

  // Use the nested loop to loop through the array, finding the minimum value each time.
  // Swap this minimum value with the pivot point of i, and the array will be sorted by the end.
  for (int i = 0; i < n - 1; i++) {
    minimum = arr[i];
    min_ind = i;

    for (int j = i; j < n; j++) {
      if (arr[j] < minimum) {
        minimum = arr[j];
        min_ind = j;
      }
    }

    swap(arr, i, min_ind);
  }
}

int main() {
  // Reference Material: https://www.geeksforgeeks.org/selection-sort/
  int arr[] = {24, 567, 23, 99, 1, 2, 50};
  int arr_len = sizeof(arr) / sizeof(arr[0]);

  selection_sort(arr, arr_len);

  for (int i = 0; i < arr_len; i++) {
    printf("%d ", arr[i]);
  }
}