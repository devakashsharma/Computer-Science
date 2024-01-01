function one () {
    const username = "Magic";

    function two () {
        const password = 123456;
        console.log(username);
    }

    // console.log(password); // it will show an error cause it doesn't have access to the two's scope
    two();
}

one();

// the concept of scope level means for ex, the two() have access the one.username but the one() doesn't have the access of two variables and this is the small part of closure. Closure is very IMP for the interview purpose

// another example
if (true) {
    const username = "vscode";
    if (username === "vscode") {
        const ide = "editor";
        console.log(username + ide);
    }
    // console.log(ide);
}

// ==============================================================================================

function addOne(num) {
    return num + 1;
}

console.log(addOne(5)); // we can call this function at line number 33 or even more and we can also call it before line no. 29

let addTwo = function(num) {
    return num + 2;
}

console.log(addTwo(5)); // we can call this function at line number 39 or after, we cannot call before line 35

// and this is known as hoisting