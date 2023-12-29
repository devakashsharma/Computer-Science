let user = "akash";
let value = 100;
// old way:
// console.log(user + value);

// modern way:
// console.log(`The user is ${user} and the value out of 100 is ${value}`);

// other way to create a string
let str = new String("Hello");
// console.log(str);
// console.log(typeof str);

// console.log(str.__proto__);
console.log(str.toUpperCase());
console.log(str.charAt(2));
console.log(str.indexOf('l'));
console.log(str.substring(0, 2));
console.log(str.slice(-5, -3));

const newStr = "    nameIsAno   "
console.log(newStr.trim());

const url = "https://akash.com/akash%20sharma/";
console.log(url.replace('%20', '-'));
console.log(url.includes("akash"));
console.log(url.includes("Akash"));

// creating array string
let strArr = "naruto-sasuke-eren-tanjiro"
console.log(strArr.split('-'));