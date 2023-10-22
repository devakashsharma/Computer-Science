// Q8

#include<stdio.h>

int main() {
    char name[] = "Akash Shamra";
    char find;
    int i = 0, count = 0;
    printf("Enter the character: ");
    scanf("%c", &find);

    while (name[i] != '\0') {
        if (find == name[i]){
            count++;
        }
        i++;
    }
    printf("The character %c is repeated %d times\n", find, count);

    return 0;
}