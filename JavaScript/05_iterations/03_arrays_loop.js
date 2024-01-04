// for of

let arr = [1, 2, 3, 4, 5];
// for (const i of arr) {
//     console.log(i);
// }

// let greetings = "Hello World!";
// for (const greet of greetings) {
//     // it will also print space, let's remove it
//     if (greet == " ") {
//         continue;
//     }
//     console.log(greet);
// }

const maps = new Map();
maps.set("IN", "India");
maps.set("US", "United States of America");
maps.set("JP", "Japan");
maps.set("US", "United States of America");

// console.log(maps);
// Map(3) {
//     'IN' => 'India',
//     'US' => 'United States of America',
//     'JP' => 'Japan'
//   }

// map is use to create an object with sequence
// for(const key of maps) {
//     console.log(key);
// }

for(const [key, value] of maps) {
    console.log(key, " : ", value);
}