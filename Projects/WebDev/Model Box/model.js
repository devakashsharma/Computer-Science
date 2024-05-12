const modelBtn = document.querySelector(".modal-btn");
const closeBtn = document.querySelector(".close-btn");
const modelOverlay = document.querySelector(".modal-overlay");

modelBtn.addEventListener("click", () => {
    modelOverlay.classList.add("open-modal")
})

closeBtn.addEventListener("click", () => {
    modelOverlay.classList.remove("open-modal")
})

