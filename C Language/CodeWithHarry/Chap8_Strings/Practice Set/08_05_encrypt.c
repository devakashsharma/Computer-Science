// Q6

#include<stdio.h>

void encrypt(char *ch);

int main() {
    char ch[] = "Akash is gonna be the Hokage";
    encrypt(ch);
    printf("Encrypt string is: %s", ch);

    return 0;
}

void encrypt(char *ch) {
    char *ptr = ch;
    while (*ptr != '\0') {
        *ptr = *ptr + 1;
        ptr++;
    }
}