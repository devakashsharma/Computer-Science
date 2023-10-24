#include<stdio.h>
#include<string.h>

struct employee {
    int code;
    char name[10];
    float salary;
};

int main() {
    struct employee em1;
    struct employee *ptr;
    ptr = &em1;
    // (*ptr).code = 23; // we can also used this to defined the variable
    ptr->code = 23; // arrow operator automatically add the . and * at starting
    
    printf("Code is %d", em1.code);

    return 0;
}
