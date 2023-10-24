// Question 1 and 2

#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr = (int *) malloc(6 *sizeof(int));
    for (int i = 0; i < 6; i++) {
        printf("Enter the value of the %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < 6; i++) {
        printf("The value of the %d element is: %d\n", i+1, ptr[i]);
    }

    free(ptr);

    return 0;
}