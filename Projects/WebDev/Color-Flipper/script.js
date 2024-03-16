const colors = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];
const btn = document.getElementById("btn");
const hexColor =  document.querySelector(".hex-color");

btn.addEventListener("click", function(){
    let displayColor = '#';
    for (let i = 0; i < 6; i++) {
        displayColor += colors[getRandomNumber()]
    }

    document.body.style.backgroundColor = displayColor;
    hexColor.textContent = displayColor;
});

// random number function
function getRandomNumber() {
    return Math.floor(Math.random() * colors.length);
}

