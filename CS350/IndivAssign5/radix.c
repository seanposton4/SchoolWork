#include <stdio.h>

void radix_sort(int arr[], int n) {
  // Get max elem of array
  int max = arr[0];

  for(int i = 1;i < n; i++) {
    if(max < arr[i]) {
      max = arr[i];
    }
  }

  // Calculate how many digits there are
  int digits = 0;

  while(max > 0) {
    max /= 10;
    digits++;
  }

  // Digits place
  int power = 1;

  // Arrange numbers based on digit places.
  for(int i = 0; i < digits; i++) {
    int new_array[n];

    int count[10];

    for(int j = 0; j < 10; j++) {
      count[j] = 0;
    }

    // Calculating frequency of digits
    for(int j = 0; j < n; j++) {
      int num = (arr[j] / power) % 10;
      count[num]++;
    }

    // Cumulative frequency of count array
    for(int j = 1; j < 10; j++) {
      count[j] += count[j-1];
    }

    // Designating new positions in the updated array
    for(int j = n - 1; j >= 0; j--) {
        int num = (arr[j] / power) % 10;
        new_array[count[num] - 1] = arr[j];
        count[num]--;
    }

    // Updating the original array using New Array
    for(int j = 0; j < n; j++) {
      arr[j] = new_array[j];
    }
      
    // Updating the digit to be considered next iteration
    power *= 10;
  }          
}

int main() {
  // Radix Sort Citation: https://www.journaldev.com/42955/radix-sort-algorithm
  int arr[] = {24, 567, 23, 99, 01, 2, 50};
  int arr_len = sizeof(arr) / sizeof(arr[0]);
  radix_sort(arr, arr_len);

  for(int i = 0; i < arr_len; i++) {
    printf("%d ", arr[i]);
  }
}