const promiseOne = new Promise(function(resolve, reject) {
    // Do async task
    setTimeout(function() {
        console.log("Task Completed");
        resolve() // now it is connected to the .then 
    }, 1000)
});

promiseOne.then(function() {
    console.log("Promise Consumed");
})

new Promise((resolve, reject) => {
    setTimeout(function() {
        console.log("Task 2");
        resolve()
    }, 1000)
}).then(function() {
    console.log("Promise 2");
})

const promiseThree = new Promise(function(resolve, reject){
    setTimeout(function() {
        resolve({username: "uzumakinaruto", rank: "hokage"});
    }, 1000)
})

promiseThree.then(function(user) {
    console.log(user);
})


// Error/reject
const promiseFour = new Promise((resolve, reject) => {
    setTimeout(() => {
        let error = true;
        if(!error) {
            resolve({username: "akash", age: 21});
        }
        else {
            reject("ERROR: Something went wrong");
        }
    }, 1000)
})

promiseFour
    .then((user) => {
    console.log(user);
    return user.username;
})
    .then((username) => {
    console.log("This is .then chaining, just like a wow(nested if-else or nested for loop, because we can't return the value to any other variable)");
    console.log(username);
})
    .catch((err) => {
    console.log(err);
})
    .finally(() => console.log("The promise is either resolved or rejected"))

    // finally will always be show either success or fail


// Async/Await
const promiseFive = new Promise((resolve, reject) => {
    setTimeout(() => {
        let error = true;
        if(!error) {
            resolve({language: "JavaScript", standard: "EcmaScript 6"});
        } else {
            reject("ERROR: JS went wrong");
        }
    }, 1000)
})

// there is only one problem with async await is that they can handle .then but they unable to handle .catch directly, so we use try and catch
// this is good but it cannot handle error
// async function consumePromiseFive() {
//     const response = await promiseFive;
//     console.log(response);
// }
// consumePromiseFive();

// this is error free code 
async function consumePromiseFive() {
    try {
        const response = await promiseFive;
        console.log(response);
    } catch (error) {
        console.log(error);
    }
}

consumePromiseFive();


// Example
// async function getData() {
//     try {
//         const response = await fetch('https://jsonplaceholder.typicode.com/users');
//         // console.log(response);
//         const data = await response.json();
//         console.log(data);
//     } catch (error) {
//         console.log("E:", error);
//     }
// }

// getData();

// let's do this by using .then and .catch

fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => {
        return response.json()
    })
    .then((data) => {
        console.log(data);
    })
    .catch((error) => {
        console.log(error);
    })