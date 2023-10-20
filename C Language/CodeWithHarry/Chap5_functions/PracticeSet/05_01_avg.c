#include<stdio.h>

float average(int x, int y, int z);

int main() {
    int num1 = 4, num2 = 6, num3 = 9;
    float avg = average(num1, num2, num3);
    printf("The average is: %d", avg);

    return 0;
}

float average(int x, int y, int z) {
    return (x + y + z)/3;
}