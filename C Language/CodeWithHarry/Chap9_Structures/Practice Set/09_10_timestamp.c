#include<stdio.h>

typedef struct dates {
    int date;
    int month;
    int year;
    int hour;
    int min;
    float sec;
} dateTime;

int timeComp(dateTime t1, dateTime t2);

int main() {
    dateTime date1 = {30, 6, 2002, 4, 32, 30.00};
    dateTime date2 = {26, 9, 2001, 4, 42, 35.00};

    printf("The timestamp is: %d/%d/%d %d-%d-%.2f\n", date1.date, date1.month, date1.year, date1.hour, date1.min, date1.sec);
    printf("The timestamp is: %d/%d/%d %d-%d-%.2f\n", date2.date, date2.month, date2.year, date2.hour, date2.min, date2.sec);

    int compare = timeComp(date1, date2);
    printf("The compare of date 1 and date 2 is: %d", compare);
    
    return 0;
}

int timeComp(dateTime t1, dateTime t2) {
    if (t1.date > t2.date) {
        return 1;
    }
    if (t1.date < t2.date) {
        return -1;
    }
    if (t1.month > t2.month) {
        return 1;
    }
    if (t1.month < t2.month) {
        return -1;
    }
    if (t1.year > t2.year) {
        return 1;
    }
    if (t1.year < t2.year) {
        return -1;
    }
    if (t1.hour > t2.hour) {
        return 1;
    }
    if (t1.hour < t2.hour) {
        return -1;
    }
    if (t1.min > t2.min) {
        return 1;
    }
    if (t1.min < t2.min) {
        return -1;
    }
    if (t1.sec > t2.sec) {
        return 1;
    }
    if (t1.sec < t2.sec) {
        return -1;
    }
    return 0;
}