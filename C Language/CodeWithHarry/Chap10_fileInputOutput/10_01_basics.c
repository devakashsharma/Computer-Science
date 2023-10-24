#include<stdio.h>

int main() {
    FILE *ptr;

/*   
    syntax:
    ptr = fopen("file.extension", "mode")
*/
/*  
    primary used mode:
    r --> open for reading and rb --> open for reading in binary
    w --> open for writitng and wb --> open for writing in binary
    a --> open for append (at the last)
*/


    // ptr = fopen("file.txt", "r"); // for reeading a file
    ptr = fopen("file.txt", "w"); // for writing a file

    return 0;
}