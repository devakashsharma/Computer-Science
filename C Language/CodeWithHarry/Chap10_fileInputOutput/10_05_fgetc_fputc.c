#include<stdio.h>

int main() {
    FILE *ptr;
    // ptr = fopen("fgetc_fputc.txt", "r");
    // char ch = fgetc(ptr);
    // printf("The value of this character is: %c\n", ch);
    // printf("The value of this character is: %c\n", ch);
    // printf("The value of this character is: %c\n", ch);
    // printf("The value of this character is: %c\n", ch);

    // printf("The value of this character is: %c\n", fgetc(ptr));
    // printf("The value of this character is: %c\n", fgetc(ptr));
    // printf("The value of this character is: %c\n", fgetc(ptr));
    // printf("The value of this character is: %c\n", fgetc(ptr));

    // fputc('A', ptr);
    // ptr = fopen("fputcfile.txt", "w");
    // fputc('a', ptr);
    // fputc('k', ptr);
    // fputc('s', ptr);
    // fputc('h', ptr);
    // fclose(ptr);

    ptr = fopen("fgetc_fputc.txt", "r");

    char c = fgetc(ptr);
    while(c != EOF) {
        printf("%c", c);
        c = fgetc(ptr);
    }
    printf("\n");

    return 0;
}