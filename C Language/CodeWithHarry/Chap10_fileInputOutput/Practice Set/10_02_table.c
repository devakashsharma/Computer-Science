#include<stdio.h>

int main() {
    FILE *ptr;
    ptr = fopen("table.txt", "w");
    int table;
    printf("Enter the table number: ");
    scanf("%d", &table);

    for(int i = 0; i < 10; i++) {
        fprintf(ptr, "%d x %d = %d\n", table, i+1, table*(i+1));
    }
    fclose(ptr);
    return 0;
}