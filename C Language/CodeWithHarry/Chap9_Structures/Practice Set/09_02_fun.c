#include<stdio.h>

typedef struct vector {
    int x;
    int y;
} vector;

vector sumVector(vector v1, vector v2) {
    vector result;
    result.x = v1.x + v2.x;
    result.y = v1.y + v2.y;
    return result;
}

int main() {
    vector v1, v2, sum;
    v1.x = 34;
    v1.y = 45;

    v2.x = 12;
    v2.y = 54;

    printf("x is %d and y is %d\n", v1.x, v1.y);
    printf("x is %d and y is %d\n", v2.x, v2.y);

    sum = sumVector(v1, v2);
    printf("sum of x dim is: %d\nsum of y dim is: %d", sum.x, sum.y);

    return 0;
}