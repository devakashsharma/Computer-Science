// Question - 4;

#include<stdio.h>

void sliceFun(char *str, int x, int y);

int main() {
    char str[] = "Akash is gonna be Hoakge";
    sliceFun(str, 1, 8);
    printf("%s", str);
    return 0;
}

void sliceFun(char *str, int x, int y) {
    int i = 0;
    while((x+i) != y) {
        str[i] = str[i+x];
        i++;
    }
    str[i] = '\0';
}