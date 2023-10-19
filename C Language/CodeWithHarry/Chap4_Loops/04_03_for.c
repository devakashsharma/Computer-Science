#include<stdio.h>

int main() {
    // for (int i = 0; i < 10; i++)
    // {
    //     printf("The value of i is: %d\n", i+1);
    // }
    
    // for (int i = 5; i >= 1; i--) {
    //     printf("The decrement of i is: %d\n", i);
    // }

    // print n natural number in reverse order
    // int n;
    // printf("Enter the number: ");
    // scanf("%d", &n);
    // for (int i = n; i > 0; i--)
    // {
    //     printf("The value of i is: %d\n", i);
    // }
    

    int i = 0, skip = 5;
    while(i < 10) {
        i++;
        if (i == skip)
        {
            continue;
        }
        else {
            printf("%d\n", i);
        }
        
    }

    return 0;
}