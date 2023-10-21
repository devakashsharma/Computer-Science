#include<stdio.h>

void printArray(int *ptr, int x);

int main() {
    int arr[] = {12, 34, 12, 54, 75};
    printArray(arr, 5);
    return 0;
}

void printArray(int *ptr, int x) {
    for(int i = 0; i < x; i++) {
        printf("The value of element %d is: %d\n", i+1, ptr[i]);
        // printf("The value of element %d is: %d\n", i+1, *(ptr + i)); // both are same
    }
}