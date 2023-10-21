// Question - 4

#include<stdio.h>

int main() {
    int table[10];
    for(int i = 0; i < 10; i++) {
        printf("Enter the value of 5 x %d = ", i+1);
        scanf("%d", &table[i]);
    }
    for (int i = 0; i < 10; i++) {
        printf("5 x %d = %d\n", i+1, table[i]);
    }
    

    return 0;
}