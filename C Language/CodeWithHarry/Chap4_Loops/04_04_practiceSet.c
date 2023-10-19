#include<stdio.h>

int main() {
/*
    // write a program to print the table of the nth number
    int table;
    printf("Enter the table number: ");
    scanf("%d", &table);
    for (int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", table, i, table*i);
    }
*/
/*
    // write a program to print the table in reverse order
    int table;
    printf("Enter the table number: ");
    scanf("%d", &table);

    for (int i = 10; i > 0; i--)
    {
        printf("%d x %d = %d\n", table, i, table*i);
    }
*/    
/*
    // write a program to print sum of the first 10 natural number using while loop
    int natural_number = 0, i = 1;
    while(i <= 10) {
        natural_number = natural_number + i;
        i++;
    }
    printf("The sum of first 10 natural number is: %d", natural_number);
*/    
/*
    // repeat above Q by using for and do while loop
    // int natural = 0;
    // for (int i = 1; i <= 10; i++) {
    //     natural += i;
    // }
    // printf("The sum of first 10 natural number is: %d", natural);
    
    // using do while loop
    int nat = 0, i = 1;
    do{
        nat += i;
        i++;
    }while(i <= 10);
    printf("The sum of first 10 natural number is: %d", nat);
*/  
/*
    // write a program to print the factorial number
    int fact = 1, n = 5;
    for(int i = 1; i <= n; i++) {
        fact *= i;
    }
    printf("The factorial of %d is: %d", n, fact);
*/  
/*
    // repeat 8 with while loop
    int i = 1, fact = 1;
    while(i <= 5) {
        fact *= i;
        i++;
    }
    printf("The factorial of 5 is: %d", fact);
*/

    // check if number is prime or not
    int isPrime = 1, num;
    printf("Enter a number: ");
    scanf("%d", &num);
    for (int i = 2; i < num/2; i++) {
        if (num % i == 0) {
            isPrime = 0;
            break;
        }
    }
    if (isPrime == 0) {
        printf("%d is not a prime number", num);
    }
    else {
        printf("%d is a prime number", num);
    }

    return 0;
}