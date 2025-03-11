document.addEventListener("DOMContentLoaded", () => {
    const slides = document.querySelectorAll(".slide");
    const sliderContainer = document.querySelector(".slider-container");
    let counter = 0;

    document.querySelector(".prev").addEventListener("click", goPrev);
    document.querySelector(".next").addEventListener("click", goNext);

    function goPrev() {
        if (counter > 0) {
            counter--;
        } else {
            counter = slides.length - 1; 
        }
        slideImage();
    }

function goNext() {
        if (counter < slides.length - 1) {
            counter++;
        } else {
            counter = 0; 
        }
        slideImage();
    }

function slideImage() {
        sliderContainer.style.transform = `translateX(-${counter * 100}%)`;
    }
});
