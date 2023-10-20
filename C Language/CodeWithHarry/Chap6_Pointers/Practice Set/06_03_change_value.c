#include<stdio.h>

int change(int *x);

int main() {
    int vari = 21;
    change(&vari);
    printf("The value of the vari after function: %d", vari);

    return 0;
}

int change(int *x) {
    return *x = *x*10;
}