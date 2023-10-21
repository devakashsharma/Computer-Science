#include<stdio.h>

int main() {
    int arr[10];
    int *ptr = arr;
    ptr = ptr + 2;

    if (ptr == &arr[2]) {
        printf("Pointer is locating to the same memory");
    }
    else {
        printf("Pointer is do not locating to the same memory");
    }
    

    return 0;
}