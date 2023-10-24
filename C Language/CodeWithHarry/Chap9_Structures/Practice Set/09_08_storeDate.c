#include<stdio.h>

struct strDates {
    int date;
    int month;
    int year;
};

int dateComp(struct strDates d1, struct strDates d2);

int main() {
    struct strDates dates;
    dates.date = 23;
    dates.month = 9;
    dates.year = 2020;

    struct strDates d2 = {21, 9, 2011};
    printf("The date is: %d/%d/%d\n", dates.date, dates.month, dates.year);
    printf("The date is: %d/%d/%d\n", d2.date, d2.month, d2.year);

    int compare = dateComp(dates, d2);
    printf("The comparison of date 1 and date 2 is: %d", compare);

    return 0;
}

int dateComp(struct strDates d1, struct strDates d2) {
    if (d1.year > d2.year) {
        return 1;
    }
    if (d1.year < d2.year) {
        return -1;
    }
    if (d1.month > d2.month) {
        return 1;
    }
    if (d1.month < d2.month) {
        return -1;
    }
    if (d1.date > d2.date) {
        return 1;
    }
    if (d1.date < d2.date) {
        return -1;
    }
    return 0;
}