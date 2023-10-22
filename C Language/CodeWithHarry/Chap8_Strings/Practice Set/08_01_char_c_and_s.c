// Question - 2;

#include<stdio.h>
#include<string.h>

int main() {
    char st1[10];
    char st2[10];
    char newChar;
    int i = 0;

    printf("Enter the string 1:\n");
    scanf("%s", st1);
    printf("Enter the charater of a string:\n");

    while(newChar != '\n') {
        fflush(stdin);
        scanf("%c", &newChar);
        st2[i] = newChar;
        i++;
    }
    st2[i-1] = '\0';

    printf("The value of st1 is: %s\n", st1);
    printf("The value of st2 is: %s\n", st2);
    printf("The comparison value of st1 and st2 is: %d\n", strcmp(st1, st2));

    return 0;
}