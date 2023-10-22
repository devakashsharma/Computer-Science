// Q9

#include<stdio.h>

int main() {
    char name[] = "Akash Sharma gonna be Hokage";
    char checks;
    printf("Enter the character: ");
    scanf("%c", &checks);
    int i = 0, count = 0;

    while (name[i] != '\0') {
        if (checks == name[i]) {
            count++;
            break;
        }
        i++;
    }
    if (count == 1) {
        printf("Yes, it is present");
    }
    else {
        printf("No, it is not present");
    }

    return 0;
}