// Immediately Invoked Function Expression (IIFE) - when we want that at the beginning of the compiling
// suppose we have data and we want that at the beginning of our program it started processing it then we use IIFE

// remember we use () for return value without writing in the previous lecture, we will do the almost same
(function conntect () {
    // it is named IIFE because it has name - conntects
    console.log("DB Connected and prevent global variable for any error/distrubance");
    console.log("we use to prevent the global variable pollution which could affect our code");
}) ();

(function conntects () {
    console.log("DB Connected and prevent global variable for any error/distrubance");
    console.log("we use to prevent the global variable pollution which could affect our code");
}) ();

// actually what is happing here is, the first () is for defining funciton within it and the last () is for execution call, and in this the ; is required because the function don't know when to end the program, without ; will run program but after the function nothing will work
// for ex:
// if there are 2 IIFE function, the first func will run but it don't know when to end the program nad thats because the second function won't run the return an error

// we can also define iife with arrow function
(() => {
    // unnamed IIFE - doesn't have any name
    console.log("DB Connected and prevent global variable for any error/distrubance");
    console.log("we use to prevent the global variable pollution which could affect our code");
})();

// one more thing how do we pass arguments to the unnamed iife?

((name) => {
    console.log("DB Connected and prevent global variable for any error/distrubance");
    console.log("we use to prevent the global variable pollution which could affect our code");
    console.log(`Hello ${name}`);
})(`Akash`);
