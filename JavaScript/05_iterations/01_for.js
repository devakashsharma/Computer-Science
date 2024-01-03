// for

// for (let i = 0; i <= 10; i++) {
//     const element = i;
//     if (element == 7) {
//         console.log(`7 thala for reason`);
//     }
//     console.log(element);
// }

// use ctrl + d to travel the same words :)


// for (let i = 1; i <= 5; i++) {
//     console.log();
//     console.log(`Table of ${i} is:`); 
//     for (let j = 1; j <= 10; j++) {
//         // console.log(`The value of Inner loop is ${j} and outer loop ${i}`);
//         console.log(`${i} x ${j} = ${i*j}`);
//     }
// }

// let myArr = ["Naruto", "Eren", "Tanjiro", "Light"];
// for (let i = 0; i < myArr.length; i++) {
//     const element = myArr[i];
//     console.log(element);
// }


// break and continue

// for (let i = 1; i <= 10; i++) {
//     console.log(`the value is: ${i}`);
//     if (i == 7) {
//         console.log(`7 detected`);
//         break;
//     }
// }

for (let i = 1; i <= 10; i++) {
    if (i == 7) {
        console.log(`7 detected`);
        continue;
    }
    console.log(`the value is: ${i}`);
}