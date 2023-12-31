// Dates

let myDate = new Date();
// console.log(myDate); // 2023-12-31T08:10:09.588Z
// console.log(myDate.toString()); // Sun Dec 31 2023 13:40:09 GMT+0530 (India Standard Time)
// console.log(myDate.toDateString()); // Sun Dec 31 2023
// console.log(myDate.toLocaleDateString()); // 31/12/2023
// console.log(myDate.toLocaleTimeString()); // 1:40:09 pm
// console.log(myDate.toJSON()); // 2023-12-31T08:10:09.588Z
// console.log(myDate.toTimeString()); // 13:40:09 GMT+0530 (India Standard Time)

// let newDate = new Date(2023, 11, 31);
// let newDate = new Date(2023, 11, 31, 13, 46);
// let newDate = new Date("2023-12-31");
let newDate = new Date("12-31-2023");

// console.log(newDate.getTime()); // 1703961000000
// console.log(newDate.toDateString()); // Sun Dec 31 2023
// console.log(newDate.toLocaleDateString()); // 31/12/2023
// console.log(newDate.toLocaleString());

let timeStamp = Date.now();
// console.log(timeStamp);
// console.log(newDate.getTime()); // so we can compare it will all others time stamps

// // to get the time into seconds
// console.log(Math.floor(Date.now()/1000));

let myNewDate = new Date();
console.log(myNewDate.getDate());
console.log(myNewDate.getDay() + 1);
console.log(`The date is ${myNewDate.getDate()} and the time is ${myNewDate.getHours()} : ${myNewDate.getMinutes()}`);

let objDate = myNewDate.toLocaleString('default', {
    weekday: 'long',
    day: "numeric",
    era: "long"
})

console.log(objDate);