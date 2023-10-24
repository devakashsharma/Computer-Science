#include<stdio.h>

int main() {
    int *ptr;
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);

    // calloc initilize with 0, means we overwrite it with our new value // you can check by removeing the 1st for loop
    ptr = (int *) calloc(num, sizeof(float));

    for (int i = 0; i < num; i++) {
        printf("Enter the value of %d element: ", i+1);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < num; i++) {
        printf("The value of the %d element is: %d\n", i+1, ptr[i]);
    }

    free(ptr);

    return 0;
}