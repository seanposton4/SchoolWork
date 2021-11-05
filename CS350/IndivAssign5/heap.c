#include <stdio.h>

int max(int i, int j, int k) {
  // Return max element of three given
  if (i >= j && i >= k) {
    return i;
  }
  else if (j >= i && j >= k) {
    return j;
  }
  else if (k >= i && k >= j) {
    return k;
  }
  else {
    return i;
  }
}

void swap(int arr[], int i, int j) {
  // Takes the two indices of the array to swap.
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

void heapify(int arr[], int i, int n) {
  // Set indices using heap child algorithm
  int left_child = 2 * i + 1;
  int right_child = 2 * i + 2;
  int max_index = i;

  // Set max based on which is largest out of child and root
  if (left_child < n && arr[left_child] > arr[max_index]) {
    max_index = left_child;
  }
  if (right_child < n && arr[right_child] > arr[max_index]) {
    max_index = right_child;
  }

  // If root isn't the largest, swap it with the child and run heapify on the child.
  if (i != max_index) {
    swap(arr, i, max_index);
    heapify(arr, max_index, n);
  }
}

void heap_sort(int arr[], int n) {
  // Build the heap to be able to heap sort
  for (int i = n / 2 - 1; i >= 0; i--) {
    heapify(arr, i, n);
  }

  // Remove one element from the heap by moving the root to the end, then 
  // running heapify on the newly shrunk heap.
  for (int i = n - 1; i > 0; i--) {
    swap(arr, 0, i);
    heapify(arr, 0, i);
  }
}

int main() {
  // Heap Sort Citation: https://www.geeksforgeeks.org/heap-sort/
  //                     https://www.mygreatlearning.com/blog/heap-sort/
  int arr[] = {24, 567, 23, 99, 1, 2, 50};
  int arr_len = sizeof(arr) / sizeof(arr[0]);

  heap_sort(arr, arr_len);

  for (int i = 0; i < arr_len; i++) {
    printf("%d ", arr[i]);
  }
}