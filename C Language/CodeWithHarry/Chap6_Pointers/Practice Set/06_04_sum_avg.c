#include<stdio.h>

void sum_avg(int x, int y, int *sum, float *avg);

int main() {
    int a = 21, b = 18, sum;
    float avg;
    sum_avg(a, b, &sum, &avg);
    printf("The value of sum is: %d\n", sum);
    printf("The value of avg is: %f\n", avg);
    return 0;
}

void sum_avg(int x, int y, int *sum, float *avg) {
    *sum = x + y;
    *avg = (float)*sum / 2;
}