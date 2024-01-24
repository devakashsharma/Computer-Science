// js is in prototypal behaviour, means if he couldn't a value then it will start checking from parents then their parents to their parents untill it gets the value or NULL value

// in js, everything is object, (but js object is not as the OOPS object)
// array -> object -> NULL
// string -> object -> NULL
// function is also techniqually an object, function is work on functional behaviour but we can also work it as an object behaviour

function multiplyBy5(num) {
    return num*5;
}
multiplyBy5.power = 2
console.log(multiplyBy5(5)); // 25
console.log(multiplyBy5.power); // 2
console.log(multiplyBy5.prototype); // {}

function createUser(name, score) {
    this.name = name;
    this.score = score;
}

createUser.prototype.increment = function() {
    this.score++; // this = jis, means whoever call, return value to them
}

createUser.prototype.printMe = () => {
    console.log(`Score is: ${this.score}`);
}

// const one = createUser("one", 10);
const one = new createUser("one", 10); // now the additional properties is also mentioned by using 'new'
const two = createUser("two", 20);

one.printMe() // it won't work untill we define it that it have the additional properties by using 'new'


// Important Questions

/*

Here's what happens behind the scenes when the new keyword is used:

A new object is created: The new keyword initiates the creation of a new JavaScript object.

A prototype is linked: The newly created object gets linked to the prototype property of the constructor function. This means that it has access to properties and methods defined on the constructor's prototype.

The constructor is called: The constructor function is called with the specified arguments and this is bound to the newly created object. If no explicit return value is specified from the constructor, JavaScript assumes this, the newly created object, to be the intended return value.

The new object is returned: After the constructor function has been called, if it doesn't return a non-primitive value (object, array, function, etc.), the newly created object is returned.

*/