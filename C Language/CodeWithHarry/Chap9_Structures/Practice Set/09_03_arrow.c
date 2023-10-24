#include<stdio.h>
#include<string.h>

typedef struct employee {
    int sno;
    char name[10];
} emp;

int main() {
    emp e1, e2;
    emp *ptr;
    ptr = &e1;

    ptr->sno = 21;
    strcpy(ptr->name, "Akash");
    printf("The code is: %d\n", e1.sno);
    printf("The name is: %s\n", e1.name);

    ptr = &e2;
    (*ptr).sno = 23;
    strcpy((*ptr).name, "Men");
    printf("The code is: %d\n", e2.sno);
    printf("The name is: %s\n", e2.name);

    return 0;
}