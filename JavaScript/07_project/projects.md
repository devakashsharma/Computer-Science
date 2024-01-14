# Projects related to DOM

## Projects link
[Click Here](https://stackblitz.com/edit/dom-project-chaiaurcode?file=index.html)

## Project 1 - Color Changer

```javascript
console.log("Project 1 - Solution");

const buttons = document.querySelectorAll(".button");
// console.log(buttons)
const body = document.querySelector("body");

buttons.forEach((button) => {
  console.log(button);
  button.addEventListener("click", (event) => {
    console.log(event);
    console.log(event.target);
    if (event.target.id === "grey") {
      body.style.backgroundColor = event.target.id;
    }
    if (event.target.id === "white") {
      body.style.backgroundColor = event.target.id;
    }
    if (event.target.id === "blue") {
      body.style.backgroundColor = event.target.id;
    }
    if (event.target.id === "yellow") {
      body.style.backgroundColor = event.target.id;
    }
  })
});
```

## Project 2 - BMI Calculator

``` javascript
const form = document.querySelector("form");

// we always should convert str into int input after users input, but if we converet the value before given input then it will return empty value
// this usecase will give you empty
// const height = parseInt(document.querySelector('#height').value)

form.addEventListener("submit", (event) => {
  event.preventDefault();
  const height = parseInt(document.querySelector("#height").value);
  const weight = parseInt(document.querySelector("#weight").value);
  const result = document.querySelector("#results");

  if (height <= 0 || height === '' || isNaN(height)) {
    result.innerHTML = `Please provide the value height ${height}`
  } else if (weight <= 0 || weight === '' || isNaN(weight)) {
    result.innerHTML = `Please provide the value weight ${weight}`
  } else {
    const BMI = (weight / ((height*height) / 10000)).toFixed(2);

    // showing the result
    if(BMI <= 18.6) {
      result.innerHTML = `<span>${BMI} Under Weight</span>`
    } else if(BMI > 18.6 && BMI <= 24.9) {
      result.innerHTML = `<span>${BMI} Normal Range</span>`
    } else {
      result.innerHTML = `<span>${BMI} Over Weight</span>`
    }
  }
})
```

## Project 3 - Digital Clock

```javascript
const clock = document.getElementById('clock');

setInterval(() => {
  let date = new Date();
  clock.innerText = date.toLocaleTimeString();
}, 1000);
```