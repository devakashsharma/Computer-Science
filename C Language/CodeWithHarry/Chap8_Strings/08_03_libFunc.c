#include<stdio.h>
#include<string.h> // to perform operation on string we need to import this library

int main() {
    // strlen()

    char *chptr = "Akash";
    int leng = strlen(chptr);
    printf("The lenght of the string is: %d\n", leng);

    // strlen() function print the lenght of the function excluding the null character i.e. \0

    // strcpy()

    char *source = "Akash";
    char target[5];
    strcpy(target, source);
    printf("The value is: %s\n", target);

    // strcat() // it is used to concatenate two strings
    char cat1[15] = "Hello_";
    char *cat2 = "World";
    strcat(cat1, cat2);
    printf("The value is: %s\n", cat1);

    // strcmp() // it is use to compare, but it checks the ascii of the 1st to the 2nd, if 1st ascii value is greater than the 2nd then it will return positive number (0, 1), otherwise negetive number will be print - -1.
    char *camp1 = "Akash";
    char *camp2 = "Hello";
    int compare = strcmp(camp1, camp2);
    printf("The value is: %d\n", compare); // -1, because if we sub Akash ascii to hello then hello is greater than akash that is why -1

    return 0;
}