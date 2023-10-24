#include<stdio.h>
#include<string.h>

// it is used to describe the custom data types, the typedef gives an alias
typedef struct employee {
    int code;
    char name[20];
    float salary;
} empl;

// void show(struct employee emp);
void show(empl emp); // both are correct, just checking

int main() {
    empl em1;
    empl *ptr;

    ptr = &em1;
    ptr->code = 101;
    strcpy(ptr->name, "Akash");
    ptr->salary = 343.23;
    show(em1);

    return 0;
}

void show(empl emp) {
    printf("The employee code is: %d\n", emp.code);
    printf("The employee name is: %s\n", emp.name);
    printf("The employee salary is: %.2f\n", emp.salary);
}