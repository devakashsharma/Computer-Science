#include<stdio.h>

void wrong_swap(int x, int y);
void swap(int *x, int *y);

int main() {
    int a = 7, b = 3;
    printf("The value of a is: %d and b is: %d before the function\n", a, b);
    wrong_swap(a, b);
    printf("The value of a is: %d and b is: %d after the function\n", a, b);
    printf("The value of a is: %d and b is: %d before the function\n", a, b);
    swap(&a, &b);
    printf("The value of a is: %d and b is: %d after the function\n", a, b);

    return 0;
}

void wrong_swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
}
void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}