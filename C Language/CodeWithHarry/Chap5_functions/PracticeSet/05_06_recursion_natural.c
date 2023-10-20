#include<stdio.h>

int naturalNumner(int x);

int main() {
    int natural = 10;
    printf("The sum of first %d natural number is: %d", natural, naturalNumber(natural));

    return 0;
}

int naturalNumber(int x) {
    if(x == 1 || x == 0) {
        return 1;
    }
    else {
        return x + naturalNumber(x-1);
    }
}