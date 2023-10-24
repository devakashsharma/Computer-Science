#include<stdio.h>

int main() {
    FILE *ptr;
    int num1, num2, num3;
    ptr = fopen("practice.txt", "r");
    fscanf(ptr, "%d %d %d", &num1, &num2, &num3);
    fclose(ptr);
    printf("The value is num1: %d, num2: %d, num3: %d\n", num1, num2, num3);
    return 0;
}