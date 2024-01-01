// var should be avoid, it doesn't support scope block {}
// let support

if (true) {
    let a = "Ore wa block scope variable";
    console.log(a, "because it is available inside the if block");
}

let a = "Ore wa globle scope variable"
console.log(a, "because it is available outside of the if block");

// global scope is different in vs code node environment and browser's console - IMP question (later discuss)