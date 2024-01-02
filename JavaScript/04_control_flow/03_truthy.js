// const userEmail = "aksh@new.com" // true
// const userEmail = "" // false
const userEmail = [] // true

if (userEmail) {
    console.log("Got user email");
} else {
    console.log("Don't have user email");
}

// falsy values
// false, 0, -0, BigInt 0n, "", null, undefined, NaN

// truthy values
// "0", "false", " ", [], {}, function(){}

// is array empyt?
if (userEmail.length === 0) {
    console.log("Array is empty");
}

const emptyObj = {};
if (Object.keys(emptyObj).length === 0) {
    console.log("Object is empty");
}

console.log(false == 0); // true
console.log(false == "0"); // true
console.log(false == ""); // true
console.log(0 == ""); // true


// Nullish coalescing operator (??) null, undefined
// suppose we are waiting for values from database and what if null or undefined values come?, so for that cases we have nullish coalescing operator
// here the first value will be assign but if that is empty then the secondary value will be assign
let val1;
val1 = 5 ?? 10; // 5
val1 = null ?? 10; // 10
val1 = undefined ?? 15; // 15
val1 = null ?? 10 ?? 15; // 10
console.log(val1);

// Terniary Operator

// condition ? true : false

const iceTeaPrice = 100
iceTeaPrice <= 80 ? console.log("less than 80") : console.log("more than 80")