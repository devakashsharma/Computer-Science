#include<stdio.h>

int main() {
    FILE *ptr;
    int num;
    int num2;
    ptr = fopen("file.txt", "r");
    fscanf(ptr, "%d", &num);
    fscanf(ptr, "%d", &num2);
    fclose(ptr);
    printf("The num is: %d\n", num);
    printf("The num2 is: %d\n", num2);
   
    return 0;
}