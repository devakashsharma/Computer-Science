// Question - 7

#include<stdio.h>

void tableArray(int *arr, int x, int num);

int main() {
    int table[3][10];

    tableArray(table[0], 10, 2);
    tableArray(table[1], 10, 7);
    tableArray(table[2], 10, 9);

    return 0;
}

void tableArray(int *arr, int x, int num) {
    printf("\nTable of %d is:\n", num);
    for (int i = 0; i < x; i++) {
        arr[i] = num*(i+1);
    }
    for (int i = 0; i < x; i++) {
        printf("%d x %d = %d\n", num, i+1, arr[i]);
    }
    printf("--------------\n");
    
}