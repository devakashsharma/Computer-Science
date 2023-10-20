#include<stdio.h>

int sum(int a, int b);

int main() {
    int a = 4, b = 6;
    printf("The value of a is: %d and b is: %d\n", a, b);
    printf("The sum of a and b is: %d\n", sum(a, b));
    printf("The value of a and b after function a is: %d and b is: %d\n", a, b); 
    // nothing will change because we always send the copy of the varibale to a function 
    // instead of actual value, thus, nothing change even if we change the value in the function

    // in the call by value we send the copy value of the varible and in the call by reference
    // we send the address of the varible thus, it is capable to change the variable value outside of the fucntion

    return 0;
}

int sum(int a, int b) {
    int c = a + b;
    a = 3453;
    b = 6576;
    return c;
}