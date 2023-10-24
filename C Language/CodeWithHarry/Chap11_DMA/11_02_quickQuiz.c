#include<stdio.h>
#include<stdlib.h>

int main() {
    float *ptr;

    ptr = (float *) malloc(4 *sizeof(float));

    for (int i = 0; i < 4; i++) {
        printf("Enter the %d element: ", i+1);
        scanf("%f", &ptr[i]);
    }

    for (int i = 0; i < 4; i++) {
        printf("The value of %d element is: %.2f\n", i+1, ptr[i]);
    }

    free(ptr);

    return 0;
}