// local reviews data
const reviews = [
    {
        id: 1,
        name:"Sara Jones",
        job: "ux designer",
        img: "./person-1.jpeg",
        text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Enim qui aut, magni velit, ea provident repellat ullam quo, porro consequatur eaque obcaecati quas laborum architecto unde earum nisi. Saepe, ea."
    },
    {
        id: 2,
        name:"jack smith",
        job: "web developer",
        img: "./person2.jpg",
        text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Debitis, corporis quo! Animi, et expedita. Saepe amet dolores aliquam explicabo molestiae assumenda delectus, facilis cum dignissimos."
    },
    {
        id: 3,
        name:"henry finch",
        job: "web developer",
        img: "./person3.jpg",
        text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Debitis, corporis quo! Animi, et expedita. Molestiae assumenda delectus, facilis cum dignissimos. Lorem ipsum dolor sit amet consectetur adipisicing elit. Debitis rerum molestias non delectus, inventore soluta."
    },
    {
        id: 4,
        name:"jane watson",
        job: "android developer",
        img: "./person4.jpg",
        text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Enim qui aut, magni velit, ea provident repellat ullam quo, porro consequatur eaque obcaecati quas laborum architecto unde earum nisi. Saepe, ea."
    }
];

// select items
const img = document.getElementById("person-img");
const author = document.getElementById("author");
const job = document.getElementById("job");
const info = document.getElementById("info");

const prevBtn = document.querySelector(".prev-btn");
const nextBtn = document.querySelector(".next-btn");
const randomBtn = document.querySelector(".random-btn");

let currentItem = 0;

window.addEventListener("DOMContentLoaded", () => {
    showPersonDetails();
});

function showPersonDetails() {
    const item = reviews[currentItem];
    img.src = item.img
    author.textContent = item.name
    job.textContent = item.job
    info.textContent = item.text
}

nextBtn.addEventListener("click", () => {
    currentItem++;

    if(currentItem > (reviews.length -1)) {
        currentItem = 0;
    }
    showPersonDetails();
});

prevBtn.addEventListener("click", () => {
    currentItem--;
    if(currentItem < 0) {
        currentItem = reviews.length - 1
    }
    showPersonDetails();
})


// random person review (practice)
// randomBtn.addEventListener("click", () => {
//     currentItem = Math.floor(Math.random() * (reviews.length - 1));
//     showPersonDetails();
// })