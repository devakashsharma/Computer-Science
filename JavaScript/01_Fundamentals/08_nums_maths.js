// ---------------------------------- Numbers ----------------------------------------

const score = 300;
console.log(score);

const balance = new Number(500);
console.log(balance);

console.log(balance.toString());
console.log(typeof (balance.toString()));
// console.log(typeof balance.toString());
console.log(balance.toString().length);

const value = 343.4353;
console.log(value);
console.log(value.toFixed(2));
console.log(value.toPrecision(3));
console.log(value.toPrecision(2));

const num = 1000000;
console.log(num.toLocaleString('en-IN'));

// ---------------------------------- Maths ----------------------------------------

console.log(Math);
console.log(Math.abs(-345)); // it convert negative value to positive
console.log(Math.round(4.4));
console.log(Math.round(4.5));
console.log(Math.ceil(4.5)); // if a number is even greater than 0.1 then it will return next number, here 4.5 will be 5, if 4.1 = 5
console.log((Math.floor(4.5))); // floor is the opposite of ceil, if num is 4.5 = 4, if 4.9 = 4, if 4.1 = 4
console.log(Math.min(3, 5, 4, 7, 8, 1, 9));
console.log(Math.max(3, 5, 4, 7, 8, 1, 9));

console.log(Math.random());
console.log((Math.random()*10) + 1);
console.log(Math.floor(Math.random() * 10) + 1);
console.log(Math.round(Math.random() * 10) + 1);

const min = 10;
const max = 20;
console.log(Math.floor(Math.random() * (max - min + 1)) + min);