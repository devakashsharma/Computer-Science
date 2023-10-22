// Q5

#include<stdio.h>

void stringCopy(char *str1, char *str2);

int main() {
    char sourceStr[10] = "Akash";
    char targetStr[6];
    stringCopy(targetStr, sourceStr);
    printf("%s", targetStr);

    return 0;
}

void stringCopy(char *str1, char *str2) {
    int i = 0;
    while(*str2 != '\0') {
        str1[i] = str2[i];
        i++;
    }
    str1[i] = '\0';
}