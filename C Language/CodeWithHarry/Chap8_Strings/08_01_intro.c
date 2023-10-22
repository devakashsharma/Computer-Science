#include<stdio.h>

int main() {
    char str1[] = {'A', 'k', 'a', 's', 'h', '\0'};
    char str[] = "Akash"; // it is the shortcut to declare the strings
    char *ptr = str;
    while (*ptr != '\0') {
        printf("%c", *ptr);
        ptr++;
    }

    // Isn't it a little bit tedious to print all the charaters by loop??
    // there is another way to print............

    char *sptr = "Akash";
    printf("%s", sptr); // %s is a format specifier

    return 0;
}