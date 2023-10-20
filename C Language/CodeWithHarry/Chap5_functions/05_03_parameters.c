#include<stdio.h>

// function prototype
int add(int a, int b);

int main() {
    int sum = add(23, 45);
    printf("The value of sum is: %d", sum);

    return 0;
}

// function declaration
int add(int a, int b) {
    int result = a + b;
    return result;
}