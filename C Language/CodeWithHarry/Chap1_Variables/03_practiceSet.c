#include<stdio.h>

int main() {
/*
    // Q1 - Area of rectangle
    // A
    int len = 23;
    int bre = 25;
    printf("The area of rectangle is: %d", len * bre);
    
    // B
    int length, breath;
    printf("Enter the length: ");
    scanf("%d", &length);
    printf("Enter the breath: ");
    scanf("%d", &breath);

    int area = length * breath;
    printf("The area of rectanlge is: %d", area);
    
*/
/*
    // Q2 - Area of circle and modified it to print the volume of cylinder
    int radius = 6;
    float pi = 3.14;
    printf("Area of circle is: %f\n", pi * radius * radius);
    int height = 8;
    printf("Volume of cylinder is: %f\n", pi * radius * radius * height);
*/
/*
    // Q3 - Celsius to Fahrenhight
    float cel = 30;
    float far = (cel * 9/5) + 32;
    printf("The valu of Celsius to farhenheit is: %f", far);
*/

    // Q4 - Simple Interest
    int principal = 2000, rate = 4, time = 2;
    int simpleInterest = (principal * rate * time) / 100;
    printf("The simple interest is: %d", simpleInterest);

    return 0;
}