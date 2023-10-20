#include<stdio.h>

void printPattern(int x);

int main() {
    int pattern;
    printf("How many pattern you want to print: ");
    scanf("%d", &pattern);
    printPattern(pattern);


    return 0;
}

void printPattern(int x) {
    if(x == 1) {
        printf("*\n");
        return;
    }
    printPattern(x-1);
    for (int i = 0; i < (2*x-1); i++) {
        printf("*");
    }
    printf("\n");
}