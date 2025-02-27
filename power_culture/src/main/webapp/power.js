document.addEventListener("DOMContentLoaded", function () {
    const menuToggle = document.querySelector(".menu-toggle");
    const nav = document.querySelector(".nav-links");

    menuToggle.addEventListener("click", function () {
        nav.classList.toggle("active");
    });
});

document.addEventListener("DOMContentLoaded", function () {
    const servicesSection = document.querySelector(".services");

    setTimeout(() => {
        servicesSection.classList.add("show");
    }, 500); // Delays the animation by 500ms for a smooth effect
});




