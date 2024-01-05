const myObj = {
    java: "Java",
    js: "JavaScript",
    py: "Python"
}

for(const key in myObj) {
    // console.log(key);
}
// java
// js
// py

for(const key in myObj) {
    // console.log(`Filename ${key} for ${myObj[key]}`);
}

let arr = [1, 2, 3, 4, 5];
for (const key in arr) {
    console.log(arr[key]);
} 

for (const key of arr) {
    console.log(key);
}