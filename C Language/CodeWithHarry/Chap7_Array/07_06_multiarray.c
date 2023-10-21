#include<stdio.h>

int main() {
    int students = 3;
    int subjects = 5;
    int marks[3][5];

    for (int i = 0; i < students; i++) {
        for (int j = 0; j < subjects; j++) {
        printf("Enter the marks of student %d in subject %d\n", i+1, j+1);
        scanf("%d", &marks[i][j]);
        }  
    }

    for (int i = 0; i < students; i++) {
        for (int j = 0; j < subjects; j++) {
            printf("The marks of student %d in subject %d is: %d\n", i+1, j+1, marks[i][j]);
        }
    }

    return 0;
}