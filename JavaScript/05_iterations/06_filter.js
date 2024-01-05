const programLang = ["Java", "JavaScript", "Python", "C++"]
// const newValue = programLang.forEach( (value) => {
//     // console.log(value);
//     return value;
// })
// console.log(newValue); // undefined?? , means the for loop doesn't return values

// for that we use filter

const myNum = [1, 2, 3, 5, 7, 3, 2, 10, 12];

// const newNum = myNum.filter( (value) => value > 5 )
const newNum = myNum.filter( (value) => {
    // if we use {} then we need to use return keyword
    return value > 5;
} );
console.log(newNum); // [ 7, 10, 12 ]

// and suppose if we want to return and filter with for each loop, then we need to do like this

const myNumber = [];
myNum.forEach( (num) => {
    if (num > 5) {
        myNumber.push(num);
    }
} )

console.log(myNumber); // [ 7, 10, 12 ]

// ------------------------------------------------------------------------------------------------

const books = [
    { title: 'Book One', genre: 'Fiction', publish: 1981, edition: 2004 },
    { title: 'Book Two', genre: 'Non-Fiction', publish: 1992, edition: 2008 },
    { title: 'Book Three', genre: 'History', publish: 1999, edition: 2007 },
    { title: 'Book Four', genre: 'Non-Fiction', publish: 1989, edition: 2010 },
    { title: 'Book Five', genre: 'Science', publish: 2009, edition: 2014 },
    { title: 'Book Six', genre: 'Fiction', publish: 1987, edition: 2010 },
    { title: 'Book Seven', genre: 'History', publish: 1986, edition: 1996 },
    { title: 'Book Eight', genre: 'Science', publish: 2011, edition: 2016 },
    { title: 'Book Nine', genre: 'Non-Fiction', publish: 1981, edition: 1989 },
];

// const userBook = books.filter( (urBook) => urBook.genre === "History" )
let userBook = books.filter( (urBook) => {
    return urBook.genre === "History"
} )

userBook = books.filter( (urBook) => {
    return urBook.edition >= 2010;
} )

userBook = books.filter( (urBook) => {
    return urBook.edition >= 2010 && urBook.genre === "Science";
} )
console.log(userBook);