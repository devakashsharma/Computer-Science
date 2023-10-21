#include<stdio.h>

int main() {
    int a = 23;
    char b = 'a';
    int *ptr = &a;
    char *chptr = &b;
    printf("The value of ptr before arithmetic: %p\n", ptr);
    ptr++;
    printf("The value of ptr after arithmetic: %p\n", ptr);
    printf("The value of chptr before arithmetic: %p\n", chptr);
    chptr++;
    printf("The value of chptr after arithmetic: %p\n", chptr);
    printf("The value is: %p", *ptr);

    return 0;
}