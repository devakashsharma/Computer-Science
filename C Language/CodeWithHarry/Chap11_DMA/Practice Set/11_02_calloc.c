#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr = (int *) calloc(4, sizeof(int));

    for (int i = 0; i < 4; i++) {
        printf("Enter the %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < 4; i++) {
        printf("The value of %d element is: %d\n", i+1, ptr[i]);
    }

    free(ptr);

    return 0;
}