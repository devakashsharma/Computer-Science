#include<stdio.h>

int main() {
    FILE *ptr;
    ptr = fopen("problem4.txt", "w");
    char name1[10];
    float salary1;
    printf("Enter your name: ");
    scanf("%s", name1);
    printf("Enter your salary: ");
    scanf("%f", &salary1);

    char name2[10];
    float salary2;
    printf("Enter your name: ");
    scanf("%s", name2);
    printf("Enter your salary: ");
    scanf("%f", &salary2);

    fprintf(ptr, "%s, %.2f\n", name1, salary1);
    fprintf(ptr, "%s, %.2f\n", name2, salary2);

    fclose(ptr);
    
    return 0;
}