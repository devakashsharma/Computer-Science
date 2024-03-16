let count = 0;

const btns = document.querySelectorAll(".btn");
const value = document.querySelector(".value");

btns.forEach((item) => {
    item.addEventListener("click", (element) => {
        // console.log(element.currentTarget.classList);
        const clickedElement = element.currentTarget.classList;

        if (clickedElement.contains("incr")) {
            count++;
        } else if (clickedElement.contains("desc")) {
            count--;
        } else {
            count = 0;
        }

        value.textContent = count;

        if (count > 0) {
            value.style.color = "green";
        } else if (count < 0) {
            value.style.color = "red"
        } else {
            value.style.color = "#102A42"
        }
    })
})
