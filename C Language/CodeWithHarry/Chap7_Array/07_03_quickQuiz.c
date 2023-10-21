#include<stdio.h>

int main() {
    // Add from a num to a pointer
    int a = 21;
    int *ptr = &a;
    printf("The value of ptr before arithmetic: %p\n", ptr);
    ptr++;
    printf("The value of ptr after arithmetic: %p\n", ptr);

    // Sub from a num to a pointer
    int sub = 12;
    int *subptr = &sub;
    printf("The value of subptr before arithmetic: %p\n", subptr);
    subptr--;
    printf("The value of subptr after arithmetic: %p\n", subptr);

    // sub from a pointer to a pointer
    int sub1 = 11, sub2 = 12;
    int *sptr1 = &sub1;
    int *sptr2 = &sub2;
    int result = sptr1 - sptr2;
    printf("The value of sptr1: %p\n", sptr1);
    printf("arithmetic: %p\n", &sptr1);
    printf("The value of sptr2: %p\n", sptr2);
    printf("The value of result is: %d\n", result);

    // conpare the two pointers
    int com1 = 23, com2 = 10;
    int *cptr1 = &com1, *cptr2 = &com2;
    if(cptr1 < cptr2) {
        printf("cptr1 is smaller than cptr2");
    }
    else {
        printf("cptr2 is smaller than cptr1");
    }

    return 0;
}