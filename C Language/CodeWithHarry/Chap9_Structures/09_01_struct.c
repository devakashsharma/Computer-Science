#include<stdio.h>
#include<string.h>

struct employee {
    int sno;
    char name[10];
    float salary;
};

int main() {
    struct employee emp1;
    emp1.sno = 10;
    // emp1.name = "Akash"; // won't work 
    emp1.salary = 50.50;
    strcpy(emp1.name, "Akash");

    // here '.' means member operator

    printf("%d\n", emp1.sno);
    printf("%s\n", emp1.name);
    printf("%.2f\n", emp1.salary);

    return 0;
}