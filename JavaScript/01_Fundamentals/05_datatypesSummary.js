// The datatypes is categorized based on how it is store in memory and how we can access them
// Officially it is divided into 2 types

// 1. Primitive - Call by value means we always use its actual value, we never refer it's value to another variable
// it has 7 types: string, number, null. boolean, undefine, symbol, BigInt
// JS is Dynamically Type Language means while declaration of variables we don't need to define it's datatype, it's type is determined by value

// symbol
const id = Symbol('123');
const newId = Symbol('123');
console.log(id === newId); // false

// BigInt
const bigNumber = 3072498579984347n;

// 2. Non Primitive - Reference Type
// Array, Objects, Function

console.log(typeof bigNumber);
console.log(typeof id);