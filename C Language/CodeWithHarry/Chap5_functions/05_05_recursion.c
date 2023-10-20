#include<stdio.h>

int factorial(int x);

int main() {
    int num = 5;
    printf("The value of %d is: %d", num, factorial(num));

    return 0;
}

int factorial(int x) {
    if (x == 1 || x == 0) {
        return 1;
    }
    else {
        return x * factorial(x-1);
    }
    
}