// suppose we have to create a function which will calculate all the items price from cart, but the problem is we don't know how many items are in the cart so how do we create function??, so here is the solution
// we will be using rest operator or spread operator
// so basically what does it do is, it make all the arguments into an array and by using loop we can add all the items price

function calculateCartPrice(...num1) {
    return num1;
}

console.log(calculateCartPrice(34, 56)); // [ 34, 56 ]
console.log(calculateCartPrice(34, 12, 45)); // [ 34, 56, 45 ]

function calculateCartsPrice(val1, val2, ...num1) {
    return num1;
}

console.log(calculateCartsPrice(34, 56)); // []
console.log(calculateCartsPrice(34, 12, 45)); // [45 ]
// because the first two element is given to val1 and val2 but they don't return to anything so they won't be in array

// we can also pass the arguments as object to functions
const obj = {
    name: "Akash Sharma",
    course: "BCA"
}

function handleObjects(anyObject) {
    console.log(`Name is ${anyObject.name} and the course choosen by him is ${anyObject.course}`);
}

handleObjects(obj);
handleObjects({
    name: "Naruto Uzumaki",
    course: "Talk No Jutsu"
})
handleObjects({
    name: "Tobirama Senju",
    course: "Uchiha Hater"
})
handleObjects({
    name: "Eren Yeager",
    course: "Rumbling"
})

// functions to get a single value from array
function returnSignalArrayValue(arr) {
    return arr[1];
}

console.log(returnSignalArrayValue([399, 200, 100, 400]));