let value = 3;
let newValue = -value;
console.log(newValue);

console.log(2**3);

console.log(1 + "2");
console.log("1" + 2);
console.log("1" + 2 + 2);
console.log(1 + 2 + "2");
console.log(true);
console.log(+true);
console.log("");
console.log(+"");

console.log("1" > 1); // false
console.log("2" > 1); // true
console.log("02" > 1); // true

console.log(null > 0); // false
console.log(null == 0); // false
console.log(null >= 0); // true, because in js comparision works different from the others, it first convert it into number, value as 0 and 0 >= 0, 0 is not greater than 0 but equal to 0; hence it return the true.

console.log(undefined == 0);
console.log(undefined > 0);
console.log(undefined >= 0);

console.log("2" == 2);
console.log("2" === 2); // is also check the datatype