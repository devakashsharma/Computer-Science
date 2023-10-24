#include<stdio.h>

typedef struct bankInformation {
    int accNum;
    char name[20];
    float balance;
    int year;
} banks;

void display(banks x);

int main() {
    banks bank[5];

    for (int i = 0; i < 5; i++) {
        printf("Enter the account number: ");
        scanf("%d", &bank[i].accNum);
        printf("Enter your name: ");
        scanf("%s", bank[i].name);
        printf("Enter balance: ");
        scanf("%f", &bank[i].balance);
        printf("Enter the account opening year: ");
        scanf("%d", &bank[i].year);
    }

    for (int i = 0; i < 5; i++) {
        display(bank[i]);
    }

    return 0;
}

void display(banks x) {
    printf("The account number is: %d\n", x.accNum);
    printf("The account holder name is: %s\n", x.name);
    printf("The account balance is: %.3f\n", x.balance);
    printf("The account opening year is: %d\n", x.year);
}