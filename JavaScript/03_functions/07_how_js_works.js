// How JS works behind

// JavaScript Execution Context

// At first js code converted to the global execution context
// and then the gec is stored in 'this'

// but in browser it stored in windows

// JS is single threaded, and all js code works inside the thread, and everything in js is a process

// we have two execution context but at some documentation have three EC
// Global Execution Context
// Function/Functional Execution Context
// Eval Execution Context (but it is one of the property of GEC)

// js is works in two phases
// 1. Memory Creation phase, some people say creation phase 
// - allocate memory for every variables declare in the js code but doesn't execute, it just allocate memeory

// 2. Execution phase 
// - all the js logic is executed in this phase, suppose there is some calcuation, functions etc and this all works under this phase, memory creation phase is just for allocating memory to functions, variables etc

// Example: How js works

let val1 = 10;
let val2 = 5;

function addNum(num1, num2) {
    let result = num1 + num2;
    return result;
}

let result1 = addNum(val1, val2);
let result2 = addNum(10, 2);

console.log(result1);
console.log(result2);

// Behind the scene
// 1. Js code converted to GEC and it is stored in this keyword

// 2. It is the first cycle/phase, Memory Creation Phase (MCP)
//      - here we allocate the memory to varibles
//      - for example from the above
//      - val1 - undefined - it allocate memeory but it doesn't provide any value to that variable, it simply allocate and then put undefine as value
//      - val2 - undefined
//      - addNum - defination - because we are just defining the function, we aren't executing it, so entire addNum function will be treated as defination
//      - result1 - undefined
//      - result2 - undefined

// 3. Second Cycle, Execution Phase
//      - in this phase it assign + calculate the program
//      - val1 = 10
//      - val2 = 5
//      - addNum - to function it will create a new box (new variable environment + exection thread) and at there it perform 2 phase 1. memory creation phase, 2. execution phase
//      - 1. mcp - val1 = undefined
//      - 1. mcp - val2 = undefined
//      - 1. mcp - total = undefined

//      - 2. ec - num1 - 10
//      - 2. ec - num2 - 5
//      - 2. ec - total - 10
//      - 2. ec - total is also returning right, so it will return to the GEC and than it assign the value

//      - result1 - 15 (it assign the value)
//      - once the exection is complete that box that variable environment will be automatically deleted
//      - result2 - 12 (after completing the process like it do result1), it create a new variable environment as everytime it being called

// callstack - work in lifo (last in first out)
// for example:
function one() {
    console.log("one");
    two();
}
function two() {
    console.log("two");
    three();
}
function three() {
    console.log("three");
}

one();
two();
three();

// one > two > three 
// two > three
// three