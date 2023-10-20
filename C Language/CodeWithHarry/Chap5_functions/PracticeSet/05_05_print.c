#include<stdio.h>

int main() {
    int a = 5;
    printf("%d %d %d", a, ++a, a++);
    // because, in compiler, it go through right to left
    // that's why it print the 5 first then the other's number

    return 0;
}