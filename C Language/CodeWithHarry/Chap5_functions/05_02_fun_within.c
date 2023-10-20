#include<stdio.h>

void hello(); // function prototype

void morning();
void afternoon();
void night();

int main() {
    // printf("Hello World, before the function call\n");
    // hello(); // function call
    // printf("Hello world, after the execution of the function\n");

    // function call within function
    morning();

    return 0;
}

// function declaration
void hello() { 
    printf("Hello There!\n");
}

void morning() {
    printf("Good Morning\n");
    afternoon();
}
void afternoon() {
    printf("Good Afternoon\n");
    night();
}
void night() {
    printf("Good Night\n");
}