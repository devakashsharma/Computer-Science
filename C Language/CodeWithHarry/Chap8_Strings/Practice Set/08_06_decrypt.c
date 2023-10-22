// Q7

#include<stdio.h>

void encrypt(char *ch);

int main() {
    char ch[] = "Blbti!jt!hpoob!cf!uif!Iplbhf";
    encrypt(ch);
    printf("Encrypt string is: %s", ch);

    return 0;
}

void encrypt(char *ch) {
    char *ptr = ch;
    while (*ptr != '\0') {
        *ptr = *ptr - 1;
        ptr++;
    }
}