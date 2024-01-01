// 1. Singleton
const singleObj = new Object();

// other way to declare
const appUsers = {};
appUsers.id = "123abc";
appUsers.name = "Mark";
appUsers["age"] = 21;

// console.log(appUsers);

// Objects within object
const newUsers = {
    id: 125343,

    name: {
        userName: {
            realName: {
                firstName: "Akash",
                lastName: "Sharma"
            },
            aliasName: {
                firstName: "Naruto",
                lastName: "Uzumaki"
            }
        },

        friendsName: {
            firstName: "abc",
            lastName: "xyz"
        }
    },

    email: "user@email.com"
}

// console.log(newUsers.name);
// console.log(newUsers.name.userName.aliasName);
// console.log(newUsers.name.userName.realName.firstName);

// concatinate 2 objects

const obj1 = {
    1: "a",
    2: "b"
};
const obj2 = {
    3: "c",
    4: "d"
};

// let obj3 = {obj1, obj2};
// console.log(obj3); // { obj1: { '1': 'a', '2': 'b' }, obj2: { '3': 'c', '4': 'd' } }

// Object.assign({}, obj1, obj2); here the target is {}, and the source is obj1, obj2; what will happen, we are saying that assign the value of obj1 and obj2 into {} and then we are assigning {} value to obj3

// let obj3 = Object.assign({}, obj1, obj2); // { '1': 'a', '2': 'b', '3': 'c', '4': 'd' }

// but there is new way and easy way to do this
let obj3 = {...obj1, ...obj2};
// console.log(obj3);

let newObj = [
    {
        id: 0,
        email: "ak@akash.com"
    },
    {
        id: 1,
        email: "ak@akash.com"
    },
    {
        id: 2,
        email: "ak@akash.com"
    },
    {
        id: 3,
        email: "ak@akash.com"
    }
]

// console.log(newObj[1].id); // 1

console.log(appUsers);
// { id: '123abc', name: 'Mark', age: 21 }

// Object.keys or values return an array with the value of Objects keys/values
console.log(Object.keys(appUsers));
// [ 'id', 'name', 'age' ]

console.log(Object.values(appUsers));
// [ '123abc', 'Mark', 21 ]

console.log(Object.entries(appUsers)); // it return(makes) the every keys and values as an individual array
// [ [ 'id', '123abc' ], [ 'name', 'Mark' ], [ 'age', 21 ] ]

// to check if the key exist in or not
console.log(appUsers.hasOwnProperty("age")); // true
console.log(appUsers.hasOwnProperty("isLoggedIn")); // false