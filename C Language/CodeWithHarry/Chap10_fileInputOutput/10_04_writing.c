#include<stdio.h>

int main() {
    FILE *ptr;
    int num = 20;
    ptr = fopen("generate.txt", "w");
    fprintf(ptr, "The number is: %d\n", num);
    fprintf(ptr, "Arigato");
    fclose(ptr);
    return 0;
}