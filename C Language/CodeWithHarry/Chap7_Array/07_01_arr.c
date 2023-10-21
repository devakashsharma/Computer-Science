#include<stdio.h>

int main() {
    // int marks[4];
    // marks[0] = 23;
    // marks[1] = 63;
    // marks[2] = 28;
    // marks[3] = 80;

    int arr[5];
    for (int i = 0; i < 5; i++) {
        printf("Enter the marks of student %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < 5; i++) {
        printf("Marks of student %d is: %d\n", i+1, arr[i]);
    }
    
    
    return 0;
}