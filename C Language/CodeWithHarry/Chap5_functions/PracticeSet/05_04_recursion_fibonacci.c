#include<stdio.h>

int fibonacci(int x);

int main() {
    int fib;
    printf("Enter a number: ");
    scanf("%d", &fib);
    printf("The fibonacci series of %d is: %d", fib, fibonacci(fib));

    return 0;
}

int fibonacci(int x) {
    if (x <= 1) {
        return x;
    }
    else {
        return fibonacci(x-1) + fibonacci(x-2);
    }
    
}