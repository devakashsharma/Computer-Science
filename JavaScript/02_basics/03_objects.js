// There are 3 ways of declaration objects

// 1. Singleton

// 2. Objects Literals

// symbols
const mySym1 = Symbol("key1");

let userDetail = {
    name: "Akash",
    "full name": "Akash Sharma",
    // mySym1: "Key1", // it will be treated as a string not a symbol
    [mySym1]: "Key1", // to use the symbol we need to define
    userName: "akash_sharma",
    age: 21,
    email: "akash@google.com",
    isLoggedIn: true,
    loginHistory: ["Sunday", "Monday"]
}

// ways to access
console.log(userDetail.email); // old way, not preferable way // we cannot access "full name" because of dot ('.')
console.log(userDetail["full name"]);
console.log(userDetail["isLoggedIn"]); // true
// console.log(typeof userDetail["mySym1"]); // string
console.log(typeof userDetail[mySym1]);

// changing the value of element
userDetail.email = "akash@akash.com";

// if we don't want to change the value then we can freeze it
Object.freeze(userDetail);
userDetail.age = 22; // it will not the change and also not give any error
console.log(userDetail);
// {
//   name: 'Akash',
//   'full name': 'Akash Sharma',
//   userName: 'akash_sharma',
//   age: 21,
//   email: 'akash@akash.com',
//   isLoggedIn: true,
//   loginHistory: [ 'Sunday', 'Monday' ],
//   [Symbol(key1)]: 'Key1'
// }

userDetail.greetings = function() {
    console.log("Hello There!");
}

userDetail.greetingUsers = function() {
    console.log(`Hello There, ${this["full name"]}`); // this is used to get the value within objects
    console.log(`Hello There, ${this.name}`);
}

console.log(userDetail.greetings); // [Function (anonymous)]
console.log(userDetail.greetings()); // Hello There!, undefined
console.log(userDetail.greetingUsers()); // Hello There, Akash Sharma