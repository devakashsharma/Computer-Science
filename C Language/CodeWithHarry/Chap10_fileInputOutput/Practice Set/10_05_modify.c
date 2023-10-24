#include<stdio.h>

int main() {
    FILE *ptr1;
    FILE *ptr2;
    ptr1 = fopen("Premodify.txt", "r");
    ptr2 = fopen("Postmodify.txt", "w");
    int num;
    fscanf(ptr1, "%d", &num);
    fprintf(ptr2, "%d", num*2);
    return 0;
}