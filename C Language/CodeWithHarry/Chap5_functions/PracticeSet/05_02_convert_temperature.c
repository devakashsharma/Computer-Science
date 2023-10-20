#include<stdio.h>

float fahrenheit(float celsius);

int main() {
    float Celsius, Fahrenheit;
    printf("Enter the temperature in celsius: ");
    scanf("%f", &Celsius);
    Fahrenheit = fahrenheit(Celsius);
    printf("The Fahrenheit is: %f", Fahrenheit);

    return 0;
}

float fahrenheit(float celsius) {
    return (celsius * 9/5) + 32;
}