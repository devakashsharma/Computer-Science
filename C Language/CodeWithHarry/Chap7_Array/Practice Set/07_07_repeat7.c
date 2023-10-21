// Question - 8

#include<stdio.h>

void tableArray(int *arr, int x, int num);

int main() {
    int arr1, arr2;
    printf("Enter the array 1: ");
    scanf("%d", &arr1);

    printf("Enter the array 2: ");
    scanf("%d", &arr2);

    int tableNum;
    printf("Enter the table number: ");
    scanf("%d", &tableNum);

    int iter;
    printf("Enter the number till you want to print: ");
    scanf("%d", &iter);

    int table[arr1][arr2];
    tableArray(table, iter, tableNum);

    return 0;
}

void tableArray(int *arr, int x, int num) {
    printf("\nTable of %d\n", num);
    for (int i = 0; i < x; i++) {
        arr[i] = num*(i+1);
    }
    for (int i = 0; i < x; i++) {
        printf("%d x %d = %d\n", num, i+1, arr[i]);
    }
    
}