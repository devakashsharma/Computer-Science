#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr = (int *) malloc(10 *sizeof(int));

    int num;
    printf("Enter the table number you want to print: ");
    scanf("%d", &num);

    for (int i = 0; i < 10; i++) {
        ptr[i] = num*(i+1);
    }
    for (int i = 0; i < 10; i++) {
        printf("%d x %d = %d\n", num, i+1, ptr[i]);
    }

    ptr = realloc(ptr, 15*sizeof(int));

    for (int i = 0; i < 15; i++) {
        ptr[i] = num*(i+1);
    }
    for (int i = 0; i < 15; i++) {
        printf("%d x %d = %d\n", num, i+1, ptr[i]);
    }

    free(ptr);
    
    return 0;
}