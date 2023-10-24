#include<stdio.h>

int main() {
    FILE *ptr1;
    FILE *ptr2;
    ptr1 = fopen("a.txt", "r");
    ptr2 = fopen("b.txt", "w");
    char ch = fgetc(ptr1);
    while (ch != EOF) {
        fputc(ch, ptr2);
        fputc(ch, ptr2);
        ch = fgetc(ptr1);
    }
    fclose(ptr1);
    fclose(ptr2);
    return 0;
}