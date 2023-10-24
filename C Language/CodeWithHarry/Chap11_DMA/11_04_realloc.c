#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr = (int *) malloc(6 *sizeof(int)); // it return void type so we need to convert into the datatype that we need

    for (int i = 0; i < 6; i++) {
        printf("Enter the value of the %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < 6; i++) {
        printf("The value of the %d element is: %d\n", i+1, ptr[i]);
    }

    // reallocating the memory by using the realloc

    ptr = realloc(ptr, 3*sizeof(int));
    for (int i = 0; i < 3; i++) {
        printf("Enter the value of the %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < 3; i++) {
        printf("The value of the %d element is: %d\n", i+1, ptr[i]);
    }

    free(ptr);

    return 0;
}