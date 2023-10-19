#include<stdio.h>

int main() {
    /*
    // write a program to find the grade of students
    int marks;
    printf("Enter the marks: ");
    scanf("%d", &marks);

    if (marks <= 100 && marks > 90) {
        printf("A+");
    }
    else if(marks <= 90 && marks > 80) {
        printf("A");
    }
    else if(marks <= 80 && marks > 60) {
        printf("B");
    }
    else if(marks <= 60 && marks > 50) {
        printf("C");
    }
    else if(marks <= 50 && marks > 35) {
        printf("D");
    }
    else {
        printf("Fail");
    }
    */

   /*
   // write a program to check if al the students have pass or not
   int accounts, business, economics;
   int total;

   printf("Enter the marks of Accounts: ");
   scanf("%d", &accounts);
   printf("Enter the marks of Business: ");
   scanf("%d", &business);
   printf("Enter the marks of Economics: ");
   scanf("%d", &economics);

   total = (accounts + business + economics) / 3;
   if ((total < 40) || (accounts < 33) || (business < 33) || (economics < 33)) {
        printf("Your total marks is %d, You are Fail", total);
   }
   else {
    printf("Your total marks is %d, You are Pass", total);
   }
   */

  /*
    // income tax slab
    float income, tax = 0;
    printf("Enter income: ");
    scanf("%f", &income);

    if (income > 250000 && income < 500000) {
        tax = tax + 0.05 * (income - 250000);
    }
    else if (income > 500000 && income < 1000000) {
        tax = tax + 0.20 * (income - 500000);
    }
    else if (income > 1000000) {
        tax = tax + 0.30 * (income - 1000000);
    }
    printf("You have to pay the tax of this month is: %f", tax);
    */

   /*
    // check if year is leap year or not
    int year;
    printf("Enter the leap year: ");
    scanf("%d", &year);
    if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0))
    {
        printf("Yes, The given year is leap year");
    }
    else {
        printf("No, It is not a leap year");
    }
    */

    /*
    // wrote a program to find the greatest number of 4
    int a, b, c, d;
    printf("Enter a: ");
    scanf("%d", &a);
    printf("Enter a: ");
    scanf("%d", &b);
    printf("Enter a: ");
    scanf("%d", &c);
    printf("Enter a: ");
    scanf("%d", &d);
    int max = a, min = a;

    if(b > max) {
        max = b;
    }
    else if(b < min) {
        min = b;
    }
    if(c > max) {
        max = c;
    }
    else if(c < min) {
        min = c;
    }
    if(d > max) {
        max = d;
    }
    else if(d < min) {
        min = d;
    }
    printf("Max: %d Min: %d", max, min);
    */

    // Check if charater is lower or not
    char a;
    printf("Enter any character: ");
    scanf("%c", &a);
    if (a >= 97 && a <= 122) {
        printf("Yes, it is lower character!");
    }
    else{
        printf("No, it is not a lower character!");
    }
    
    return 0;
}