#include<stdio.h>

void hello(); // function prototype

// Quick Quiz - display good morning, afternoon, night
void morning();
void afternoon();
void night();

int main() {
    // printf("Hello World, before the function call\n");
    // hello(); // function call
    // printf("Hello world, after the execution of the function\n");

    // Quick Quiz
    morning();
    afternoon();
    night();

    // we call function within function - next file

    return 0;
}

// function declaration
void hello() { 
    printf("Hello There!\n"); 
}

void morning() {
    printf("Good Morning\n");
}
void afternoon() {
    printf("Good Afternoon\n");
}
void night() {
    printf("Good Night\n");
}