# Projects related to DOM

## Projects link
[click Here](https://stackblitz.com/edit/dom-project-chaiaurcode?file=index.html)

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