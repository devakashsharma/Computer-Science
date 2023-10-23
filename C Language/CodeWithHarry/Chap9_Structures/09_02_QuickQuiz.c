#include<stdio.h>
#include<string.h>

struct employee {
    int sno;
    char name[20];
    float salary;
};

void scanSno(int num, int x);
void scanName(char name[], int x);

int main() {
    struct employee em1, em2, em3;
    printf("Enter the code of the 1st employee: ");
    scanf("%d", &em1.sno);
    printf("Enter the name of the 1st employee: ");
    scanf("%s", em1.name);
    printf("Enter the salary of the 1st employee: ");
    scanf("%f", &em1.salary);

    printf("Enter the code of the 2nd employee: ");
    scanf("%d", &em2.sno);
    printf("Enter the name of the 2nd employee: ");
    scanf("%s", em2.name);
    printf("Enter the salary of the 2nd employee: ");
    scanf("%f", &em2.salary);

    printf("Enter the code of the 3rd employee: ");
    scanf("%d", &em3.sno);
    printf("Enter the name of the 3rd employee: ");
    scanf("%s", em3.name);
    printf("Enter the salary of the 3rd employee: ");
    scanf("%f", &em3.salary);

    return 0;
}
