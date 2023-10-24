#include<stdio.h>

typedef struct complex {
    int x;
    int y;
} comp;

void show(comp x);

int main() {
    comp cnum[5];

    for (int i = 0; i < 5; i++) {
        printf("Enter the %d real num: ", i+1);
        scanf("%d", &cnum[i].x);
        printf("Enter the %d complex num: ", i+1);
        scanf("%d", &cnum[i].y);
    }

    for (int i = 0; i < 5; i++) {
        show(cnum[i]);
    }

    return 0;
}

void show(comp x) {
    printf("The value of x is: %d\n", x.x);
    printf("The value of y is: %d\n", x.y);
}