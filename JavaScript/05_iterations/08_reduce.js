// const num = [1, 2, 3, 4, 5];
const num = [1, 2, 3, 4, 5];

const myNum = num.reduce((accumulator, currentValue) => {
    console.log(`acc: ${accumulator}, currVal: ${currentValue}`);
    return accumulator + currentValue;
}, 500)
console.log(myNum);

const shopingCart = [
    {
        product: "Dell i5 Laptop",
        price: 50000
    },
    {
        product: "HP i5 Laptop",
        price: 40000
    },
    {
        product: "Dell i7 Laptop",
        price: 57000
    },
    {
        product: "New i5 Laptop",
        price: 70000
    }
]

const priceToPay = shopingCart.reduce((acc, currentValue) => {
    return acc + currentValue.price;
}, 0);

console.log(priceToPay);