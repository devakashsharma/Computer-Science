let arr = [2, 34, 5, 2, 5, 7, 4];
// console.log(arr);
// console.log(arr[4]);

// In JS arrays are collection of different datatypes
// it uses shallow copy (original value refers)

// other way to declare array
let newArr = new Array(2, 4, 6, 8, 9);
// console.log(newArr[3]);

// arr.push(9); // it will add element at the last
// console.log(arr);
// arr.pop(); // it will delete the last element
// console.log(arr);

// newArr.unshift(5); // it add the element at the start
// console.log(newArr);
// newArr.shift(); // it delete the element at the start
// console.log(newArr);

// console.log(newArr.includes(5));
// console.log(newArr.includes(4));
// console.log(newArr.indexOf(4));

// let myArr = newArr.join(); // the join will add between the two elements but it also convert the array into string
// console.log(newArr);
// console.log(myArr);
// console.log(typeof myArr);

// slice and splice
console.log("Before slice: " + arr); // Before slice: 2,34,5,2,5,7,4

let myArr1 = arr.slice(1, 3); // the last range doesn't include
console.log("Slice: " + myArr1); // lice: 34,5

console.log("After slice: " + arr); // After slice: 2,34,5,2,5,7,4


console.log("Before splice: " + arr); // Before splice: 2,34,5,2,5,7,4

let myArr2 = arr.splice(1, 3); // the last range include
console.log("Splice: " + myArr2); // Splice: 34,5,2

console.log("After splice: " + arr); // After splice: 2,5,7,4

// slice doesn't change the org arr, it basically copy the elements value and give to the new array
// unlike the slice, splice place the elements from the an array to the new array, that affect the org array