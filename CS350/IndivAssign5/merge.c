#include <stdio.h>
#include <stdlib.h>

void merge(int arr[], int l, int m, int r) {
  // Merge two arrays in sorted order
  int i, j, k;

  // Length of temp arrays
  int n1 = m - l + 1;
  int n2 = r - m;

  // Initalize temp arrays and copy data from subarrays over to them
  int tempL[n1];
  int tempR[n2];
  for (i = 0; i < n1; i++) {
    tempL[i] = arr[l + i];
  }
  for (j = 0; j < n2; j++) {
    tempR[j] = arr[m + 1 + j];
  }

  // Initial indices of first subarr, second subarr, and merged subarr
  i = 0;
  j = 0;
  k = l;

  // Merge tempL and tempR back into arr
  while (i < n1 && j < n2) {
    if (tempL[i] <= tempR[j]) {
      arr[k] = tempL[i];
      i++;
    }
    else {
      arr[k] = tempR[j];
      j++;
    }
    k++;
  }

  // Copy remaining elems of tempL
  while (i < n1) {
    arr[k] = tempL[i];
    i++; 
    k++;
  }

  // Copy remaining elems of tempR
  while (j < n2) {
    arr[k] = tempR[j];
    j++; 
    k++;
  }
}

void merge_sort(int arr[], int l, int r) {
  if (l < r) {
    // Get midsection of array, split into halves, and merge back together sorted.
    int m = l + (r - l) / 2;
    merge_sort(arr, l, m);
    merge_sort(arr, m + 1, r);
    merge(arr, l, m, r);
  }
}

int main() {
  // Merge Sort Citation: https://www.geeksforgeeks.org/merge-sort/
  int arr[] = {24, 567, 23, 99, 1, 2, 50};
  int arr_len = sizeof(arr) / sizeof(arr[0]);
  merge_sort(arr, 0, arr_len - 1);

  for (int i = 0; i < arr_len; i++) {
    printf("%d ", arr[i]);
  }
}