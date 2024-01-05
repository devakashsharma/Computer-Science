let arr = [1, 2, 3, 4, 5];
// arr.forEach(function (value) {
//     console.log(value);
// })
// // arr.forEach((value) => {
// //     console.log(value);
// // })

// function printMe(item) {
//     console.log(item);
// }

// arr.forEach(printMe); // we just need to send the reference of the function, not the execute

arr.forEach( (element, index, arrList) => {
    // console.log(element, index, arrList);
})

const newInfo = [
    {
        languageName: "JavaScript",
        languageFile: "js"
    },
    {
        languageName: "Java",
        languageFile: "java"
    },
    {
        languageName: "Python",
        languageFile: "py"
    }
]

newInfo.forEach((value, index) => {
    // console.log(index, value);
    console.log(index, value.languageName);
})