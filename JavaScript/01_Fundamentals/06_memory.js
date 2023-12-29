// stack (Primitive) and heap (Non Primitive)
// JS have automatic garbage collector

// whenever we store in stack we get the copy of our variable's value 
// in heap we get the reference value means if we change the value of reference then it will also affect the original value
// for exam:

let userName1 = "akashsharma";
let userName2 = userName1;
userName2 = "lordvader";
console.log(userName1);
console.log(userName2);

let detail = {
    userEmail: "user@gmail.com",
    userPass: "xyz"
}

let detail2 = detail;
detail2.userEmail = "newuser@gmail.com"
console.log(detail);
console.log(detail2);