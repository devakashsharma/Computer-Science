#include<stdio.h>

int main() {
    // char str[15];
    // printf("Enter your name: ");
    // scanf("%s", str);
    // printf("Your name is: %s", str);

    // but by using the scanf we unable to get the more than one strings
    // so to take input with spaces then we can use gets()

    // gets(str);
    // puts(str);

    // we can declare the string by using the pointer
    // char *ptr = "Akash";
    // char sptr[] = "Akash is gonna";
    // puts(ptr);
    // printf("%s", sptr);


    char *ptr1 = "Akash";
    ptr1 = "Shinobi Akash by ptr1"; // we change it because it's store the reference not the orignal value



    char ptr2[] = "Akash";
    // ptr2 = "Shinobi Akash by ptr2"; // we cannot change the string values if we declare it by using the an array, because array is immutable
    printf("%s\n", ptr1);
    printf("%s\n", ptr2);

    // Ways to declare and print a strings
    char *newPtr1 = "Akash"; // 1
    char *newPtr12[] = "Akash"; // 2

    char newStr3[10]; // 3
    printf("Enter your name: ");
    scanf("%s", newStr3);

    char newStr4[] = {'A', 'k', 'a', 's', 'h', '\0'};

    char newStr5[] = "Akash"; // it is the shortcut to declare the strings

    char *newPtr5 = newStr5;
    while (*newPtr5 != '\0') {
        printf("%c", *newPtr5);
        newPtr5++;
    }

    printf("Your name is: %s", newStr5);

    gets(newStr5);
    puts(newStr5);

    return 0;
}