#include<stdio.h>

void address(int x);

int main() {
    int i = 21;
    printf("The address of i is: %d\n", &i);
    address(i);
    return 0;
}

void address(int x) {
    printf("The address of the given call is: %d\n", &x);
}