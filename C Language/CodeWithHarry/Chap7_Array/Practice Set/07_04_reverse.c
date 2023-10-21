// Question - 5

#include<stdio.h>

// Mine:

void reverseArray(int arr[], int x);

int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    for (int i = 0; i < 5; i++) {
        printf("Enter the elements in the array: ");
        scanf("%d", &arr[i]);
    }

    reverseArray(arr, size);

    return 0;
}

void reverseArray(int arr[], int x) {
    for (int i = (x-1); i >= 0; i--) {
        printf("%d\n", arr[i]);
    }   
}


// CodeWithHarry

// int reverse(int *arr, int n) {
//     for(int i = 0; i < (n/2); i++) {
//         int temp = arr[i];
//         arr[i] = arr[n-i-1];
//         arr[n-i-1] = temp;
//     }
// }

// int main() {
//     int arr[] = {1, 2, 3, 4, 5, 6, 7};
//     reverse(arr, 7);
//     for (int i = 0; i < 7; i++) {
//         printf("The value of %d element is: %d\n", i+1, arr[i]);
//     }

//     return 0;
// }