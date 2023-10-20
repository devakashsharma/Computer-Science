#include<stdio.h>

int main() {
    int runs = 264;
    int *ptr = &runs;
    int **ptr_ptr = &ptr;
    printf("The value of runs by using pointer to pointer is: %u", **ptr_ptr);

    return 0;
}