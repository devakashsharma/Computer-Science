#include<stdio.h>
#include<math.h>

int main() {
    int side;
    printf("Enter the side value: ");
    scanf("%d", &side);
    printf("The value of area of square is: %f", pow(side, 2));

    return 0;
}