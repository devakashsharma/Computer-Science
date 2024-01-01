// function defination
function sayMyName() {
    console.log("Hello There!");
}

// function reference
sayMyName // it is just showing that there is a function named sayMyName and it is available dash dash place, it will not return anything but when we use '()' that means we are trying to execute the function

// function execution
sayMyName();

function addTwoNumbers(num1, num2) {
    return num1 + num2;
}

let result = addTwoNumbers(45, 98);
console.log(result);

function loginMessage(username = "You") {
    // if (username === undefined) {
    if (!username) { // professional style
        console.log("Please enter your username");
        return
    }
    return `${username} Just logged in`
}

console.log(loginMessage("Akash"));  // Akash Just logged in
console.log(loginMessage("")); //  Just logged in
console.log(loginMessage()); // undefined