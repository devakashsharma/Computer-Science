// this - it refer the current object's context

const user = {
    username: "akash",
    age: 21,
    welcomeMessage: function() {
        console.log(`${this.username}, Welcome to Microsoft`); // this refering the user's object context(value)
        console.log(this);
    }
}

user.welcomeMessage();
user.username = "Akash";
user.welcomeMessage();

console.log(this); // {}
// in vscode if we run this cmd then it will show {} and empty object cause there is no object but if we run the same cmd in browser then it will show windows, because windows is the global scope in browser


// +++++++++++++++++++++++++++++++++++++++++++ Arrow ++++++++++++++++++++++++++++++++++++++++++++++

function oneFun () {
    console.log(this); // gonna blow ur mind
}
oneFun();

function one () {
    let username = "jsdev"
    console.log(this.username);
}
one(); // undefined

// we cannot use this properly in this way, that is why we use arrow

// basic arrow function
const arrFunc = () => {
    let username = "jsdev"
    // console.log(this.username);
    console.log(arrFunc.username);
}

console.log(arrFunc());

const addTwoNumber = (num1, num2) => {
    return num1 + num2;
}

// When we have single line then we can use - implicit return arrow fucntion
// const addTwo = (num1, num2) => num1 + num2;
const addTwo = (num1, num2) => (num1 + num2); // when we {} then return keyword is required and when we use () then we don't need to use return keyword
console.log(addTwo(5, 5));

const addObj = () => ({username: "vscode"});
console.log(addObj());