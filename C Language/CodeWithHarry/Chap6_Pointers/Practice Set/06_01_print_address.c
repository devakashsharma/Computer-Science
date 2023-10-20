#include<stdio.h>

int main() {
    int a = 34;
    int *p = &a;
    printf("The value of a is: %d\n", a);
    printf("The value of a is: %d\n", *p);
    printf("The address of a is: %p\n", p);

    return 0;
}