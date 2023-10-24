#include<stdio.h>
#include<string.h>

struct employee {
    int code;
    char name[20];
    float salary;
};

void show(struct employee emp);

int main() {
    // we cannot change the value of the struct while passing the value to a function
    struct employee em1;
    struct employee *ptr;

    ptr = &em1;
    ptr->code = 101;
    strcpy(ptr->name, "Akash");
    ptr->salary = 343.23;
    show(em1);

    return 0;
}

void show(struct employee emp) {
    printf("The employee code is: %d\n", emp.code);
    printf("The employee name is: %s\n", emp.name);
    printf("The employee salary is: %.2f\n", emp.salary);
}