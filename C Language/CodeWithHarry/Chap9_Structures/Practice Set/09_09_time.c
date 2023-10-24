#include<stdio.h>

typedef struct strDate {
    int hour;
    int min;
    float sec;
} strDate;

int dateComp(strDate t1, strDate t2);

int main() {
    strDate time;
    time.hour = 41;
    time.min = 9;
    time.sec = 202.0;

    strDate time2 = {21, 9, 20.11};
    printf("The date is: %d/%d/%f\n", time.hour, time.min, time.sec);
    printf("The date is: %d/%d/%f\n", time2.hour, time2.min, time2.sec);

    int compare = dateComp(time, time2);
    printf("The comparison of date 1 and date 2 is: %d", compare);

    return 0;
}

int dateComp(strDate t1, strDate t2) {
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