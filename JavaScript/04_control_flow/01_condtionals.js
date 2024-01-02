// Control FLow / Logic Flow

// if

if (2 == "2") {
    console.log("Executed");
}

if (2 === "2") {
     console.log("Executed");
}
else {
    console.log("Not Executed");
}

let temperature = 29;
if (temperature < 30) {
    console.log("Less than 30");
} else {
    console.log("Greater than 30");
}

// we can also declare the implicit if (single line)
// if (2 == 2) console.log("One line"), console.log("Two line"),
// console.log("Three line");


let userLoggedIn = true;
let debitCard = true;
if (userLoggedIn && debitCard) {
    console.log("You can buy our products");
}