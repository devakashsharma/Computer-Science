// JS is prototype based programming language not the object oriented programming

// object literals - which define directly
const objLiterals = {
    username: "akash",
    age: 21,

    getUserDetails: function() {
        // console.log(`username: ${username}`);
        // how do the js know which username i'm looking for??, so it will return an error
        console.log(`username: ${this.username}`);
        console.log(this); // current context which means the entire object {}
    }
}

// console.log(objLiterals.getUserDetails());

// constructors
// const promiseOne = new Promise()
// In JavaScript, the 'new' keyword is used to create an instance of an object that is defined by a constructor function.

function userInfo (username, loggedCount, isLoggedIn) {
    this.username = username;
    this.loggedCount = loggedCount;
    this.isLoggedIn = isLoggedIn;

    return this;
}

const userOne = new userInfo("Akira", 11, true);
const userTwo = new userInfo("Yorichi", 31, true); // this line will overwrite the userOne, so to avoid this situation we use new keyword

console.log(userOne); // userInfo { username: 'Akira', loggedCount: 11, isLoggedIn: true }
console.log(userTwo); // userInfo { username: 'Yorichi', loggedCount: 31, isLoggedIn: true }

// step 1 - new object is creating
// step 2 - now the constructor is called because of the new keyword, and it return all the arguments
// step 3 - this is injected to the values
// step 4 - return the values

// check the constructor
console.log(userOne.constructor); // [Function: userInfo]