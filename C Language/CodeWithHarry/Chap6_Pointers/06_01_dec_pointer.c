#include<stdio.h>

int main() {
    int i = 21;
    int *j = &i;
    printf("The value of i is: %d\n", i);
    printf("The value of i using pointer is: %d\n", *j);
    printf("The address of i using &i is: %u \n", &i);
    printf("The address of i using j is: %u \n", j);
    printf("The address of j using &j is: %u \n", &j);
    printf("The value of j using *(&j) is: %u \n", *(&j));

    return 0;
}