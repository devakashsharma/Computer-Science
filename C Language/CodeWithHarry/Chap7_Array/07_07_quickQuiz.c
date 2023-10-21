#include<stdio.h>

int main() {
    int arr[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                printf("Enter the value of array %d and it's array %d\n", i+1, j+1);
                scanf("%d", &arr[i][j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                printf("The value of array %d and it's array %d is: %d\n", i+1, j+1, arr[i][j]);
            }
            
        }
        
    return 0;
}