#include<stdio.h>

struct vector {
    int x;
    int y;
};

int main() {
    struct vector v1, v2;
    v1.x = 34;
    v1.y = 45;

    v2.x = 12;
    v2.y = 54;

    printf("x is %d and y is %d\n", v1.x, v1.y);
    printf("x is %d and y is %d\n", v2.x, v2.y);

    return 0;
}