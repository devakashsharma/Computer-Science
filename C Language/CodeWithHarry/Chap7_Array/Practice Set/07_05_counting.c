// Question - 6

#include<stdio.h>

int countPositive(int arr[], int size);

int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int arr[size];

    for (int i = 0; i < size; i++) {
        printf("Enter the element no. %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    
    int count = countPositive(arr, size);
    printf("Total positive numbers in the array is: %d", count);

    return 0;
}

int countPositive(int arr[], int size) {
    int countPos = 0;
    for (int i = 0; i < size; i++) {
        if (arr[i] > 0) {
            countPos++;
        }
    }
    return countPos;
}