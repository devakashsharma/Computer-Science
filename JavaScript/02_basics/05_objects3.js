const course = {
    courseName: "JavaScript",
    price: "Free",
    courseInstructor: "HC"
}
console.log(course.courseName); // JavaScript
// there is another way to print the value of any object and we call it de-structure of objects (we can also do it with array)

// Syntax:
// const/let {key_name: alias(Optional)} = object_name;

// const {courseName} = course;
// console.log(courseName); // JavaScript

const {courseName: coNm} = course;
console.log(coNm); // JavaScript

// we always (most of the time) use the api in json format
// how do we create a json file? so syntax:

// {
//     "name": "akash",
//     "age": 20,
// }

// so this is json format