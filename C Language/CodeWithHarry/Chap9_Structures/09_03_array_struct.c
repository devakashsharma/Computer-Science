#include <stdio.h>
#include <string.h>

struct employee {
    int code;
    char name[10];
    float salary;
};

struct info {
    char name[10];
    int age;
};


int main() {
    struct employee facebook[10];
    facebook[0].code = 12;
    facebook[0].salary = 243;
    strcpy(facebook[0].name, "Akash");

    printf("%d\n", facebook[0].code);

    struct info Naruto = {"Naruto", 17};
    printf("Name is: %s\n", Naruto.name);
    printf("Name is: %d\n", Naruto.age);

    return 0;
}