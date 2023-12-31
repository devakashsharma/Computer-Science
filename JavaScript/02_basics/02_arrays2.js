let moviesChar = ["Ethan", "Skywalker", "Edward"];
let animeChar = ["Eren", "Naruto", "Yuji"];

moviesChar.push(animeChar);
console.log(moviesChar);
console.log(moviesChar[3]);
console.log(moviesChar[3][0]);

let multiChar = moviesChar.concat(animeChar);
console.log(multiChar); // [ 'Ethan', 'Skywalker', 'Edward', 'Eren', 'Naruto', 'Yuji' ]

// but there is a new way to do this, spread methods 😂
// actully what does it do is, it spread all the element character as individual charater or element
// one more the developers prefer it because we can concat as many array as we want
// for example:
// let ultimateChar = [...moviesChar, ...animeChar, ...newchar, ...again, ...againAndAgain ...etc];

let ultimateChar = [...moviesChar, ...animeChar];
console.log(ultimateChar); // [ 'Ethan', 'Skywalker', 'Edward', 'Eren', 'Naruto', 'Yuji' ]

// Ummmmmmm promblem...........
let dimArr = [1, 2, 3, 4, [5, 6, 7], 8, [3, 5, 2, [5, 2, 1]]];
console.log(dimArr); // [ 1, 2, 3, 4, [ 5, 6, 7 ], 8, [ 3, 5, 2, [ 5, 2, 1 ] ] ]

// there is 2D or 3D available and we need to create a new array with the value of existing array in a single dimension, so we can use flat() and in flat we need to pass the depth like how deep we want to go 2D array or 3D array, it is imp to pass the calculated depth but when we don't know then we can pass Infinity.

let singleArr = dimArr.flat(Infinity); // [ 1, 2, 3, 4, 5, 6, 7, 8, 3, 5, 2, 5, 2, 1 ]

// let singleArr = dimArr.flat(1); // [ 1, 2, 3, 4, 5, 6, 7, 8, 3, 5, 2, [ 5, 2, 1 ] ]

console.log(singleArr);

console.log(Array.isArray("Akash")); // asking if it is exiting or not
console.log(Array.from("Akash")); // creating an array
console.log(Array.from({name: "Akash"})); // IMP to know (Search it)

let s1 = 100;
let s2 = 200;
let s3 = 300;
let s4 = 400;

console.log(Array.of(s1, s2, s3, s4));