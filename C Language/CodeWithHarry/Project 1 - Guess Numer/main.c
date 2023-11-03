#include<stdio.h>
#include<stdlib.h>
#include<time.h>


int main() {
    int number, guess, no_attempt = 1;
    srand(time(0));
    number = rand() % 100 + 1; // generate a randem number between 1 to 100

    // keep playing till the end of the game
    do
    {
        printf("\nGuess the Number between 1 to 100!\n");
        scanf("%d", &guess);

        if (guess > number) {
            printf("Choose lower number!\n");
        }
        else if(guess < number) {
            printf("Choose higher number!\n");
        }
        else {
            printf("\nCongratulations!!\nYou've guess the right number in %d attempt!\n\n", no_attempt);
        }

        no_attempt++; // No of Attempts
        
    } while (guess != number);
    
    return 0;
}
