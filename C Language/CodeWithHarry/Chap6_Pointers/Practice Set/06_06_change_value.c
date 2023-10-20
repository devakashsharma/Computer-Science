// It is the repeation of Q3 but here we will use call by value function

#include<stdio.h>

int changeValue(int x);

int main() {
    int a = 23;
    changeValue(a);
    printf("The value of a after the function: %d", a);
    return 0;
}

int changeValue(int x) {
    return x*10;
}