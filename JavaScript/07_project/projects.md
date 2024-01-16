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

## Project 4 - Guess Number

```javascript
let randomNumber = parseInt(Math.random() * 100 + 1);

const submit = document.querySelector("#subt");
const userInput = document.querySelector("#guessField");
const guessesSlot = document.querySelector(".guesses");
const lastResult = document.querySelector(".lastResult");
const lowOrHigh = document.querySelector(".lowOrHi");
const startOver = document.querySelector(".resultParas");

const pGraph = document.createElement('p');

let preVal = [];
let numGuess = 1;

let playgame = true;

if(playgame) {
  submit.addEventListener("click", (event) => {
    event.preventDefault();
    const guess = parseInt(userInput.value);
    console.log(guess);
    validateGuess(guess);
  });
}

function validateGuess(guess) {
  if(isNaN(guess)) {
    alert(`Please enter valid number`);
  } else if(guess < 1) {
    alert(`Please enter a number more than 1`);
  } else if(guess > 100) {
    alert(`Please enter a number less than 100`);
  } else {
    preVal.push(guess);
    if(numGuess === 10) {
      displayGuess(guess);
      displayMessage(`Game over and the random number was ${randomNumber}`);
      endGame();
    } else {
      displayGuess(guess);
      checkGuess(guess);
    }
  }
}

function checkGuess(guess) {
  if (guess === randomNumber) {
    displayMessage(`Yes, you guessed it right.`);
    endGame();
  } else if (guess < randomNumber) {
    displayMessage(`Your guessed number is Lower than Computer's number.`);
  } else if (guess > randomNumber) {
    displayMessage(`Your guessed number is Higher than Computer's number.`);
  }
}

function displayGuess(guess) {
  userInput.value = '';
  guessesSlot.innerHTML += `${guess}, `;
  numGuess++;
  lastResult.innerHTML = `${11 - numGuess} `;
}

function displayMessage(message) {
  lowOrHigh.innerHTML = `<h2>${message}</h2>`;
}

function endGame() {
  userInput.value = '';
  userInput.setAttribute("disabled", "");
  pGraph.classList.add("button");
  pGraph.innerHTML = `<h2 id="startNewGame" style="background-color: black; padding: 10px 3px;">Start New Game</h2>`
  startOver.append(pGraph);
  playgame = false;
  newGame();
}

function newGame() {
  const newGameBtn = document.querySelector("#startNewGame");
  newGameBtn.addEventListener("click", (event) => {
    randomNumber = parseInt(Math.random() * 100 + 1);
    preVal = [];
    numGuess = 1;
    guessesSlot.innerHTML = '';
    lastResult.innerHTML = `${11 - numGuess} `;
    userInput.removeAttribute("disabled");
    startOver.removeChild(pGraph);
    playgame = true;
  })

}

```

## Project 5 - Keyboard Check
```javascript
const insert = document.getElementById("insert");

window.addEventListener("keydown", (event) => {
  insert.innerHTML = `
  <div class="color">
    <table>
      <tr>
        <th>Key</th>
        <th>Keycode</th> 
        <th>Code</th>
      </tr>
      <tr>
        <th>${event.key === " " ? "Space": event.key}</th>
        <th>${event.keyCode}</th> 
        <th>${event.code}</th>
      </tr>
    </table>
  </div>
  `
})
```

## Project 6 - Unlimited Color
```javascript
const randomColor = function () {
  const hex = '0123456789ABCDEF';
  let color = '#';
  for (let i = 0; i < 6; i++) {
    color += hex[Math.floor(Math.random() * 16)];
  }
  return color;
};

let intervalID;
const startChangingColor = function() {
  if(!intervalID) {
    intervalID = setInterval(changeBgColor, 1000);
  }

  function changeBgColor() {
    document.body.style.backgroundColor = randomColor();
  }
};
const stopChangingColor = function() {
  clearInterval(intervalID);
  intervalID = null;
};
document.querySelector('#start').addEventListener('click', startChangingColor);
document.querySelector('#stop').addEventListener('click', stopChangingColor);
```