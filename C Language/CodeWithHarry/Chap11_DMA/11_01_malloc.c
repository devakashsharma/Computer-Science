#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    // sizeof operator in c
    // printf("The size of the int in your pc is: %d\n", sizeof(int));
    // printf("The size of the float in your pc is: %d\n", sizeof(float));
    // printf("The size of the char in your pc is: %d\n", sizeof(char));

    ptr = (int *) malloc(6 *sizeof(int)); // it return void type so we need to convert into the datatype that we need

    for (int i = 0; i < 6; i++) {
        printf("Enter the value of the %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < 6; i++) {
        printf("The value of the %d element is: %d\n", i+1, ptr[i]);
    }

    free(ptr); // it is used to deallocate the memory

    return 0;
}