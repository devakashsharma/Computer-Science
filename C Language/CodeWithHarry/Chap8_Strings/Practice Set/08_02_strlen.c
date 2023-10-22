// Question - 3;

#include<stdio.h>

int stringLength(char *str);

int main() {
    char ptr[] = "Akash";
    int count = stringLength(ptr);
    printf("The length of this string will be: %d", count);

    return 0;
}

int stringLength(char *str) {
    int count = 0;
    while(*str != '\0') {
        count++;
        str++;
    }
    return count;
}