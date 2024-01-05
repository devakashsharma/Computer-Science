const num = [1, 2, 3, 4, 5, 6, 7, 8];
// const newNum = num.map( (element) => {
//     return element + 10;
// })

// const newNum = num.map( (element) => element + 10)
// console.log(newNum);

// // using for each 
// num.forEach((element) => {
//     console.log(element + 10); 
// })

// chaining in JS
const chainingInJS = num
.map((element) => element * 10)
.map((element) => element + 5)
.filter((element) => element > 50)

console.log(chainingInJS);